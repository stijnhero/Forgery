package com.stijnhero.forgery.client.renderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Date: 30/04/2015 11:47:07
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

public class ModelForgeryFurnace extends ModelBase
{
  //fields
    ModelRenderer Bottom;
    ModelRenderer LiquidTank;
    ModelRenderer PartInput;
    ModelRenderer Top;
    ModelRenderer ChimneyBase;
    ModelRenderer Chimney;
  
  public ModelForgeryFurnace()
  {
	  textureWidth = 32;
	  textureHeight = 32;
    
      Bottom = new ModelRenderer(this, 0, 0);
      Bottom.addBox(0F, 0F, 0F, 16, 2, 16);
      Bottom.setRotationPoint(-8F, 22F, -8F);
      Bottom.setTextureSize(32, 32);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
      LiquidTank = new ModelRenderer(this, 0, 0);
      LiquidTank.addBox(0F, 0F, 0F, 14, 4, 14);
      LiquidTank.setRotationPoint(-7F, 18F, -7F);
      LiquidTank.setTextureSize(32, 32);
      LiquidTank.mirror = true;
      setRotation(LiquidTank, 0F, 0F, 0F);
      PartInput = new ModelRenderer(this, 0, 0);
      PartInput.addBox(0F, 0F, 0F, 12, 4, 12);
      PartInput.setRotationPoint(-6F, 14F, -6F);
      PartInput.setTextureSize(32, 32);
      PartInput.mirror = true;
      setRotation(PartInput, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 0, 0);
      Top.addBox(0F, 0F, 0F, 10, 1, 10);
      Top.setRotationPoint(-5F, 13F, -5F);
      Top.setTextureSize(32, 32);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      ChimneyBase = new ModelRenderer(this, 0, 0);
      ChimneyBase.addBox(0F, 0F, 0F, 8, 2, 8);
      ChimneyBase.setRotationPoint(-4F, 11F, -4F);
      ChimneyBase.setTextureSize(32, 32);
      ChimneyBase.mirror = true;
      setRotation(ChimneyBase, 0F, 0F, 0F);
      Chimney = new ModelRenderer(this, 0, 0);
      Chimney.addBox(0F, 0F, 0F, 6, 3, 6);
      Chimney.setRotationPoint(-3F, 8F, -3F);
      Chimney.setTextureSize(32, 32);
      Chimney.mirror = true;
      setRotation(Chimney, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Bottom.render(f5);
    LiquidTank.render(f5);
    PartInput.render(f5);
    Top.render(f5);
    ChimneyBase.render(f5);
    Chimney.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
