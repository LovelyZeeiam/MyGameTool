package xueLi.GameTool.For3D;

public class FPSTimer {

	private static int counter = 0;
	private static int fps = 0;

	private static long time1 = 0;

	/**
	 * 检测fps值
	 * 1s刷新一次
	 * 没有到该刷新的时间时会返回上一次计算的fps
	 * @return fps值
	 */
	public static int getFPS() {
		counter++;
		if (DisplayManager.currentTime - time1 >= 1000) {
			fps = counter;
			counter = 0;
			time1 = DisplayManager.currentTime;
			if (DisplayManager.isDebug)
				System.out.println("FPS : " + fps);
		}
		return fps;
	}

}
