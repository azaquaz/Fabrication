package com.unascribed.fabrication.logic;

import com.unascribed.fabrication.support.injection.HijackReturn;
import net.minecraft.client.render.RenderLayer;

public class BlinkingDropsOverlay {
	public static boolean isDropped = false;
	public static Integer newOverlay = null;
	public static HijackReturn renderLayer;
}
