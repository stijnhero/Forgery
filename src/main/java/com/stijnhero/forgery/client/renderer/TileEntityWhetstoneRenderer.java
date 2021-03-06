package com.stijnhero.forgery.client.renderer;

import net.minecraft.block.Block;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotations;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import com.stijnhero.forgery.ForgeryBlocks;
import com.stijnhero.forgery.common.block.BlockForgeryFurnace;
import com.stijnhero.forgery.common.tileentity.TileEntityWhetstone;

public class TileEntityWhetstoneRenderer extends TileEntitySpecialRenderer {
	private final ModelWhetstoneBase model1;
	private final ModelWhetstoneStone model2;
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	public TileEntityWhetstoneRenderer() {
		this.model1 = new ModelWhetstoneBase();
		this.model2 = new ModelWhetstoneStone();
	}

	@Override
	public void renderTileEntityAt(TileEntity te, double posX, double posY, double posZ, float p_180535_8_, int p_180535_9_) {

		EnumFacing facing = (EnumFacing) te.getWorld().getBlockState(te.getPos()).getValue(FACING);

		TileEntityWhetstone tile = (TileEntityWhetstone) te;

		GL11.glPushMatrix();
		GL11.glTranslatef((float) posX + 0.5F, (float) posY + 1.5F, (float) posZ + 0.5F);
		ResourceLocation texture1 = (new ResourceLocation("Texture"));
		Minecraft.getMinecraft().renderEngine.bindTexture(texture1);
		GL11.glPushMatrix();
		GL11.glRotatef(180F, getRotationFromFacing(facing), 0.0F, 1.0F);
		GL11.glTranslatef(0.0f, 0.0f, -0.3f);
		this.model1.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 1.0F, 0.0625F);
		GL11.glPopMatrix();
		GL11.glPopMatrix();

		GL11.glPushMatrix();
		ResourceLocation texture2 = (new ResourceLocation("Texture"));
		Minecraft.getMinecraft().renderEngine.bindTexture(texture2);

		GL11.glPopMatrix();
		GL11.glTranslatef((float) posX + 0.5F, (float) posY + 0.5F, (float) posZ + 0.0F);

		// ROTATE
		GL11.glTranslated(0.0f, -0.059f, 0.528f);
		if (facing == EnumFacing.SOUTH || facing == EnumFacing.NORTH) {
			GL11.glRotatef(tile.getRotate(), -1.0f, 0.0f, 0.0f);
		}
		if (facing == EnumFacing.EAST || facing == EnumFacing.WEST) {
			GL11.glRotatef(tile.getRotate(), 0.0f, 0.0f, -1.0f);
		}
		GL11.glTranslated(0.0f, 0.159f, -0.528f);

		if (facing == EnumFacing.SOUTH || facing == EnumFacing.NORTH) {
			GL11.glRotatef(180, 1.0f, 0, 1.0f);
			GL11.glTranslatef(0.125f, 0, -0.045f);
		}
		if (facing == EnumFacing.EAST || facing == EnumFacing.WEST) {
			GL11.glRotatef(180, 0, 0, 1.0f);
			GL11.glTranslatef(-0.375f, 0, 0.425F);
		}
		this.model2.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
		tile.setRotate();
		GL11.glPushMatrix();
	}

	public float getRotationFromFacing(EnumFacing facing) {
		if (facing == EnumFacing.NORTH)
			return 0.0F;
		else if (facing == EnumFacing.EAST)
			return -1.0F;
		else if (facing == EnumFacing.SOUTH)
			return 180F;
		else if (facing == EnumFacing.WEST)
			return 1.0F;

		return 0.0F;
	}
}