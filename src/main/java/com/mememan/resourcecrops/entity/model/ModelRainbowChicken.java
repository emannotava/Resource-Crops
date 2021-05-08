package com.mememan.resourcecrops.entity.model;

import com.google.common.collect.ImmutableList;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelRainbowChicken<T extends Entity> extends AnimalModel<T> {
	private final ModelPart root;
	private final ModelPart r_wing;
	private final ModelPart beak;
	private final ModelPart l_leg;
	private final ModelPart l_wing;
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart r_leg;
	public ModelRainbowChicken() {
			textureWidth = 64;
			textureHeight = 32;
			root = new ModelPart(this);
			root.setPivot(0.0F, 0.0F, 0.0F);
			

			r_wing = new ModelPart(this);
			r_wing.setPivot(4.0F, 13.0F, 0.0F);
			root.addChild(r_wing);
			r_wing.setTextureOffset(24, 13).addCuboid(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);
			r_wing.setTextureOffset(0, 17).addCuboid(-0.5F, 1.5F, -3.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);

			beak = new ModelPart(this);
			beak.setPivot(0.0F, 15.0F, -4.0F);
			root.addChild(beak);
			beak.setTextureOffset(14, 0).addCuboid(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			beak.setTextureOffset(18, 8).addCuboid(-1.0F, -3.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

			l_leg = new ModelPart(this);
			l_leg.setPivot(-1.0F, 19.0F, 1.0F);
			root.addChild(l_leg);
			l_leg.setTextureOffset(26, 0).addCuboid(-2.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

			l_wing = new ModelPart(this);
			l_wing.setPivot(-4.0F, 13.0F, 0.0F);
			root.addChild(l_wing);
			l_wing.setTextureOffset(24, 13).addCuboid(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);
			l_wing.setTextureOffset(0, 17).addCuboid(0.5F, 1.5F, -3.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);

			head = new ModelPart(this);
			head.setPivot(0.0F, 15.0F, -4.0F);
			root.addChild(head);
			head.setTextureOffset(0, 0).addCuboid(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(14, 4).addCuboid(-1.0F, -7.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(14, 4).addCuboid(-0.5F, -8.5F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 4).addCuboid(-0.5F, -8.5F, -1.4F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 4).addCuboid(-0.5F, -8.5F, 0.1F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 4).addCuboid(-0.5F, -8.5F, -2.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 4).addCuboid(-0.5F, -8.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 4).addCuboid(-0.5F, -8.5F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 4).addCuboid(-1.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(14, 4).addCuboid(-1.0F, -6.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(14, 4).addCuboid(-1.0F, -6.5F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

			body = new ModelPart(this);
			body.setPivot(0.0F, 16.0F, 0.0F);
			root.addChild(body);
			setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
			body.setTextureOffset(0, 9).addCuboid(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F, false);

			r_leg = new ModelPart(this);
			r_leg.setPivot(2.0F, 19.0F, 1.0F);
			root.addChild(r_leg);
			r_leg.setTextureOffset(26, 0).addCuboid(-2.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
	}
	// @Override
	// public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	// 		//previously the render function, render code was moved to a method below
	// }
	@Override
	public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
			root.render(matrixStack, buffer, packedLight, packedOverlay);
	}
	public void setRotationAngle(ModelPart bone, float x, float y, float z) {
			bone.pitch = x;
			bone.yaw = y;
			bone.roll = z;
	}



	protected Iterable<ModelPart> getHeadParts() {
		return ImmutableList.of(this.head, this.beak);
	 }
  
	 protected Iterable<ModelPart> getBodyParts() {
		return ImmutableList.of(this.body, this.r_leg, this.l_leg, this.r_wing, this.l_wing);
	 }
	 
	 public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
		this.head.pitch = headPitch * 0.017453292F;
		this.head.yaw = headYaw * 0.017453292F;
		this.beak.pitch = this.head.pitch;
		this.beak.yaw = this.head.yaw;
		// this.wattle.pitch = this.head.pitch;
		// this.wattle.yaw = this.head.yaw;
		this.body.pitch = 1.5707964F;
		this.r_leg.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
		this.l_leg.pitch = MathHelper.cos(limbAngle * 0.6662F + 3.1415927F) * 1.4F * limbDistance;
		this.r_wing.roll = animationProgress;
		this.l_wing.roll = -animationProgress;
	 }

}