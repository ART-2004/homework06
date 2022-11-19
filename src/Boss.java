public class Boss extends GameEntity {

     public Boss(WeaponType weaponType, String weaponName) {
          this.setWeaponInfo(weaponType, weaponName);
     };

     // Getter
     public void getBossInfo() {
          this.getWeaponInfo();
     }

     // Setter
     public void setBossInfo(WeaponType weaponType, String weaponName) {
          this.setWeaponInfo(weaponType, weaponName);
     }
}
