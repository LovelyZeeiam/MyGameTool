import java.io.IOException;

import org.lwjgl.opengl.GL11;

import xueLi.GameTool.For3D.DisplayManager;

public class Example {

	private static int width = 1200, height = 680;

	//这个是主方法
	//运行这个方法会显示出一个窗口 然后宁就可以开始愉快啦~
	public static void main(String[] args) throws IOException {
		// 创建一个显示区域
		DisplayManager.create(width, height, null);
		
		//让宁的鼠标深陷其中无法自♂拔
		//Mouse.setGrabbed(true);
		//这个女生为什么这么喜欢玩哲学233333
		
		while (DisplayManager.isRunning()) {
			//检测键盘事件
			DisplayManager.keyTest();
			
			//清屏搞事情
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
			
			//TODO: 窗口渲染
			

			// 这是显示窗口的刷新
			DisplayManager.update();
		}

		// 资源释放
		DisplayManager.destroy();

		System.exit(0);

	}
}
