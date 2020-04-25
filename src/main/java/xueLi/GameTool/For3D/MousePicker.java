package xueLi.GameTool.For3D;

import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class MousePicker {

	public static Vector3f ray, camPos;

	/**
	 * 检测我的摄像机指向哪个地方 求宁了（卢本伟nb!
	 */
	public static void ray(Vector pos) {
		camPos = new Vector3f(pos.x, pos.y, pos.z);

		// float MouseX = Mouse.getX();
		// float MouseY = Mouse.getY();
		// Vector2f normalizedMouseCoords = new Vector2f((2f * (MouseX)) /
		// Display.getWidth() - 1f,(2f * (MouseY)) / Display.getHeight() - 1f);
		Vector4f clipCoords = new Vector4f(0, 0, -1f, 1f);

		Matrix4f invertedProj = Matrix4f.invert(GLHelper.lastTimeProjMatrix, null);
		Vector4f eyeCoords_origin = Matrix4f.transform(invertedProj, clipCoords, null);
		Vector4f eyeCoords = new Vector4f(eyeCoords_origin.x, eyeCoords_origin.y, -1f, 0f);
		Matrix4f invertedView = Matrix4f.invert(GLHelper.lastTimeViewMatrix, null);
		Vector4f rayWorld = Matrix4f.transform(invertedView, eyeCoords, null);
		ray = new Vector3f(rayWorld.x, rayWorld.y, rayWorld.z);
		ray.normalise();
	}

}
