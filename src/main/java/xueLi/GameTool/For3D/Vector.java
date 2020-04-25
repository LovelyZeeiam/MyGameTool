package xueLi.GameTool.For3D;

/**
 * 一个向量类（应该可以酱紫叫叭
 * 定义了这个向量的起点位置和旋转方向
 * 比较适合用作摄像机视角
 *
 */
public class Vector {

	public float x, y, z;
	public float rotX, rotY, rotZ;

	public Vector() {
		x = y = z = rotX = rotY = rotZ = 0;
	}

	public Vector(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
		rotX = rotY = rotZ = 0;
	}

	public Vector(float x, float y, float z, float rotX, float rotY, float rotZ) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.rotX = rotX;
		this.rotY = rotY;
		this.rotZ = rotZ;
	}

}
