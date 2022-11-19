public class Weapon {
    private WeaponType weaponType;
    private String weaponName;

    public void getWeaponInfo() {
        System.out.println(this.weaponType);
        System.out.println(this.weaponName);
    }

    public void setWeaponInfo(WeaponType weapon, String weaponName) {
        this.weaponType = weapon;
        this.weaponName = weaponName;
    }

}
