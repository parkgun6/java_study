package d11.bullet;

public class BulletMain {

	public static void main(String[] args) {
		
		Rifle rifle = new Rifle();
		rifle.fire(new Bullet());
		rifle.fire(new SoundBullet());
		rifle.fire(new LightBullet());
		
	}
}
