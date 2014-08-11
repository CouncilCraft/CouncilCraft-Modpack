package net.minecraft.src;
//Exported java file
//Keep in mind that you still need to fill in some blanks
// - ZeuX

public class turret extends ModelBase
{
	public turret()
	{
		base = new ModelRenderer(this, 0, 207);
		base.addBox(0F, 0F, 0F, 24, 24, 24, 0F);
		base.setRotationPoint(-12F, 0F, -12F);
		base.rotateAngleX = 0F;
		base.rotateAngleY = 0F;
		base.rotateAngleZ = 0F;
		base.mirror = false;
		lebaseangle = new ModelRenderer(this, 0, 162);
		lebaseangle.addBox(0F, 0F, 0F, 24, 24, 20, 0F);
		lebaseangle.setRotationPoint(-12F, -20F, 1F);
		lebaseangle.rotateAngleX = -0.5759587F;
		lebaseangle.rotateAngleY = 0F;
		lebaseangle.rotateAngleZ = 0F;
		lebaseangle.mirror = false;
		baseleg2angle = new ModelRenderer(this, 80, 147);
		baseleg2angle.addBox(0F, 0F, 0F, 11, 4, 11, 0F);
		baseleg2angle.setRotationPoint(-20F, 20F, 8F);
		baseleg2angle.rotateAngleX = 0F;
		baseleg2angle.rotateAngleY = 0.7853982F;
		baseleg2angle.rotateAngleZ = 0F;
		baseleg2angle.mirror = false;
		cockpit = new ModelRenderer(this, 96, 194);
		cockpit.addBox(0F, 0F, 0F, 24, 44, 17, 0F);
		cockpit.setRotationPoint(-12F, -20F, 1F);
		cockpit.rotateAngleX = 0F;
		cockpit.rotateAngleY = 0F;
		cockpit.rotateAngleZ = 0F;
		cockpit.mirror = false;
		door = new ModelRenderer(this, 80, 96);
		door.addBox(0F, 0F, 0F, 17, 44, 6, 0F);
		door.setRotationPoint(-9F, -20F, 18F);
		door.rotateAngleX = 0F;
		door.rotateAngleY = 0F;
		door.rotateAngleZ = 0F;
		door.mirror = false;
		baseleg1 = new ModelRenderer(this, 0, 129);
		baseleg1.addBox(0F, 0F, 0F, 11, 4, 29, 0F);
		baseleg1.setRotationPoint(8F, 20F, 8F);
		baseleg1.rotateAngleX = 0F;
		baseleg1.rotateAngleY = 0F;
		baseleg1.rotateAngleZ = 0F;
		baseleg1.mirror = false;
		baseleg2 = new ModelRenderer(this, 0, 129);
		baseleg2.addBox(0F, 0F, 0F, 11, 4, 29, 0F);
		baseleg2.setRotationPoint(-20F, 20F, 8F);
		baseleg2.rotateAngleX = 0F;
		baseleg2.rotateAngleY = 0F;
		baseleg2.rotateAngleZ = 0F;
		baseleg2.mirror = false;
		baseleg1angle = new ModelRenderer(this, 80, 147);
		baseleg1angle.addBox(0F, 0F, 0F, 11, 4, 11, 0F);
		baseleg1angle.setRotationPoint(3.5F, 20F, 8F);
		baseleg1angle.rotateAngleX = 0F;
		baseleg1angle.rotateAngleY = 0.7853982F;
		baseleg1angle.rotateAngleZ = 0F;
		baseleg1angle.mirror = false;
		turretcannon2 = new ModelRenderer(this, 120, 56);
		turretcannon2.addBox(0F, 0F, 0F, 5, 3, 16, 0F);
		turretcannon2.setRotationPoint(-18F, -28F, 6F);
		turretcannon2.rotateAngleX = 0F;
		turretcannon2.rotateAngleY = 0F;
		turretcannon2.rotateAngleZ = 0F;
		turretcannon2.mirror = false;
		turretbase = new ModelRenderer(this, 200, 0);
		turretbase.addBox(0F, 0F, 0F, 15, 3, 14, 0F);
		turretbase.setRotationPoint(-8F, -23F, 4F);
		turretbase.rotateAngleX = 0F;
		turretbase.rotateAngleY = 0F;
		turretbase.rotateAngleZ = 0F;
		turretbase.mirror = false;
		turretdecoration = new ModelRenderer(this, 16, 41);
		turretdecoration.addBox(0F, 0F, 0F, 17, 6, 30, 0F);
		turretdecoration.setRotationPoint(-9F, -30F, -4F);
		turretdecoration.rotateAngleX = 0F;
		turretdecoration.rotateAngleY = 0F;
		turretdecoration.rotateAngleZ = 0F;
		turretdecoration.mirror = false;
		turretangle1 = new ModelRenderer(this, 111, 28);
		turretangle1.addBox(0F, 0F, 0F, 6, 6, 20, 0F);
		turretangle1.setRotationPoint(-15F, -27F, 3F);
		turretangle1.rotateAngleX = 0F;
		turretangle1.rotateAngleY = 0F;
		turretangle1.rotateAngleZ = -0.7853982F;
		turretangle1.mirror = false;
		turretangle2 = new ModelRenderer(this, 111, 28);
		turretangle2.addBox(0F, 0F, 0F, 6, 6, 20, 0F);
		turretangle2.setRotationPoint(6F, -27F, 3F);
		turretangle2.rotateAngleX = 0F;
		turretangle2.rotateAngleY = 0F;
		turretangle2.rotateAngleZ = -0.7853982F;
		turretangle2.mirror = false;
		turretcannon1 = new ModelRenderer(this, 162, 28);
		turretcannon1.addBox(0F, 0F, 0F, 2, 2, 45, 0F);
		turretcannon1.setRotationPoint(11F, -24F, -20F);
		turretcannon1.rotateAngleX = 0F;
		turretcannon1.rotateAngleY = 0F;
		turretcannon1.rotateAngleZ = -0.7853982F;
		turretcannon1.mirror = false;
		turretcannon4 = new ModelRenderer(this, 162, 28);
		turretcannon4.addBox(0F, 0F, 0F, 2, 2, 45, 0F);
		turretcannon4.setRotationPoint(-14.3F, -24F, -20F);
		turretcannon4.rotateAngleX = 0F;
		turretcannon4.rotateAngleY = 0F;
		turretcannon4.rotateAngleZ = -0.7853982F;
		turretcannon4.mirror = false;
		turretrightwing = new ModelRenderer(this, 162, 28);
		turretrightwing.addBox(0F, 0F, 0F, 2, 2, 45, 0F);
		turretrightwing.setRotationPoint(-14.3F, -30F, -20F);
		turretrightwing.rotateAngleX = 0F;
		turretrightwing.rotateAngleY = 0F;
		turretrightwing.rotateAngleZ = -0.7853982F;
		turretrightwing.mirror = false;
		turretcannon2 = new ModelRenderer(this, 162, 28);
		turretcannon2.addBox(0F, 0F, 0F, 2, 2, 45, 0F);
		turretcannon2.setRotationPoint(11F, -30F, -20F);
		turretcannon2.rotateAngleX = 0F;
		turretcannon2.rotateAngleY = 0F;
		turretcannon2.rotateAngleZ = -0.7853982F;
		turretcannon2.mirror = false;
		turretleftwing = new ModelRenderer(this, 120, 56);
		turretleftwing.addBox(0F, 0F, 0F, 5, 3, 16, 0F);
		turretleftwing.setRotationPoint(12.3F, -28F, 6F);
		turretleftwing.rotateAngleX = 0F;
		turretleftwing.rotateAngleY = 0F;
		turretleftwing.rotateAngleZ = 0F;
		turretleftwing.mirror = false;
		turretleftprotector = new ModelRenderer(this, 0, 0);
		turretleftprotector.addBox(0F, 0F, 0F, 2, 6, 21, 0F);
		turretleftprotector.setRotationPoint(17.3F, -29.4F, 3F);
		turretleftprotector.rotateAngleX = 0F;
		turretleftprotector.rotateAngleY = 0F;
		turretleftprotector.rotateAngleZ = 0F;
		turretleftprotector.mirror = false;
		turretleftprotectorangle1 = new ModelRenderer(this, 0, 0);
		turretleftprotectorangle1.addBox(0F, 0F, 0F, 2, 4, 21, 0F);
		turretleftprotectorangle1.setRotationPoint(15.5F, -31.4F, 3F);
		turretleftprotectorangle1.rotateAngleX = 0F;
		turretleftprotectorangle1.rotateAngleY = 0F;
		turretleftprotectorangle1.rotateAngleZ = -0.6108652F;
		turretleftprotectorangle1.mirror = false;
		turretleftprotectorangle2 = new ModelRenderer(this, 0, 0);
		turretleftprotectorangle2.addBox(0F, 0F, 0F, 2, 4, 21, 0F);
		turretleftprotectorangle2.setRotationPoint(17.5F, -24.4F, 3F);
		turretleftprotectorangle2.rotateAngleX = 0F;
		turretleftprotectorangle2.rotateAngleY = 0F;
		turretleftprotectorangle2.rotateAngleZ = 0.6108652F;
		turretleftprotectorangle2.mirror = false;
		turretrightprotector = new ModelRenderer(this, 0, 0);
		turretrightprotector.addBox(0F, 0F, 0F, 2, 6, 21, 0F);
		turretrightprotector.setRotationPoint(-19.7F, -29.4F, 3F);
		turretrightprotector.rotateAngleX = 0F;
		turretrightprotector.rotateAngleY = 0F;
		turretrightprotector.rotateAngleZ = 0F;
		turretrightprotector.mirror = false;
		turretrightprotectorangle1 = new ModelRenderer(this, 0, 0);
		turretrightprotectorangle1.addBox(0F, 0F, 0F, 2, 4, 21, 0F);
		turretrightprotectorangle1.setRotationPoint(-17.5F, -32.4F, 3F);
		turretrightprotectorangle1.rotateAngleX = 0F;
		turretrightprotectorangle1.rotateAngleY = 0F;
		turretrightprotectorangle1.rotateAngleZ = 0.6108652F;
		turretrightprotectorangle1.mirror = false;
		turretrightprotectorangle2 = new ModelRenderer(this, 0, 0);
		turretrightprotectorangle2.addBox(0F, 0F, 0F, 2, 4, 21, 0F);
		turretrightprotectorangle2.setRotationPoint(-19.5F, -23.4F, 3F);
		turretrightprotectorangle2.rotateAngleX = 0F;
		turretrightprotectorangle2.rotateAngleY = 0F;
		turretrightprotectorangle2.rotateAngleZ = -0.6108652F;
		turretrightprotectorangle2.mirror = false;
		turret = new ModelRenderer(this, 117, 0);
		turret.addBox(0F, 0F, 0F, 21, 8, 20, 0F);
		turret.setRotationPoint(-11F, -31F, 3F);
		turret.rotateAngleX = 0F;
		turret.rotateAngleY = 0F;
		turret.rotateAngleZ = 0F;
		turret.mirror = false;
		basedecoration1 = new ModelRenderer(this, 0, 91);
		basedecoration1.addBox(0F, 0F, 0F, 6, 24, 13, 0F);
		basedecoration1.setRotationPoint(12F, -16F, 6F);
		basedecoration1.rotateAngleX = -0.5759587F;
		basedecoration1.rotateAngleY = 0F;
		basedecoration1.rotateAngleZ = 0F;
		basedecoration1.mirror = false;
		basedecoration2 = new ModelRenderer(this, 0, 91);
		basedecoration2.addBox(0F, 0F, 0F, 6, 24, 13, 0F);
		basedecoration2.setRotationPoint(-18F, -16F, 6F);
		basedecoration2.rotateAngleX = -0.5759587F;
		basedecoration2.rotateAngleY = 0F;
		basedecoration2.rotateAngleZ = 0F;
		basedecoration2.mirror = false;
	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		base.render(f5);
		lebaseangle.render(f5);
		baseleg2angle.render(f5);
		cockpit.render(f5);
		door.render(f5);
		baseleg1.render(f5);
		baseleg2.render(f5);
		baseleg1angle.render(f5);
		turretcannon2.render(f5);
		turretbase.render(f5);
		turretdecoration.render(f5);
		turretangle1.render(f5);
		turretangle2.render(f5);
		turretcannon1.render(f5);
		turretcannon4.render(f5);
		turretrightwing.render(f5);
		turretcannon2.render(f5);
		turretleftwing.render(f5);
		turretleftprotector.render(f5);
		turretleftprotectorangle1.render(f5);
		turretleftprotectorangle2.render(f5);
		turretrightprotector.render(f5);
		turretrightprotectorangle1.render(f5);
		turretrightprotectorangle2.render(f5);
		turret.render(f5);
		basedecoration1.render(f5);
		basedecoration2.render(f5);
	}
	
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}
	
	//fields
	public ModelRenderer base;
	public ModelRenderer lebaseangle;
	public ModelRenderer baseleg2angle;
	public ModelRenderer cockpit;
	public ModelRenderer door;
	public ModelRenderer baseleg1;
	public ModelRenderer baseleg2;
	public ModelRenderer baseleg1angle;
	public ModelRenderer turretcannon2;
	public ModelRenderer turretbase;
	public ModelRenderer turretdecoration;
	public ModelRenderer turretangle1;
	public ModelRenderer turretangle2;
	public ModelRenderer turretcannon1;
	public ModelRenderer turretcannon4;
	public ModelRenderer turretrightwing;
	public ModelRenderer turretcannon2;
	public ModelRenderer turretleftwing;
	public ModelRenderer turretleftprotector;
	public ModelRenderer turretleftprotectorangle1;
	public ModelRenderer turretleftprotectorangle2;
	public ModelRenderer turretrightprotector;
	public ModelRenderer turretrightprotectorangle1;
	public ModelRenderer turretrightprotectorangle2;
	public ModelRenderer turret;
	public ModelRenderer basedecoration1;
	public ModelRenderer basedecoration2;
}