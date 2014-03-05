package net.co.java.skill;

public enum WeaponType {
	BLADE(410),
    SWORD(420),
    BACKSWORD(421),
    HOOK(430),
    WHIP(440),
    AXE(450),
    HAMMER(460),
    CLUB(480),
    SCEPTER(481),
    DAGGER(490),
    BOW(500),
    GLAIVE(510),
    POLEAXE(530),
    LONGHAMMER(540),
    SPEAR(560),
    WAND(561),
    HALBERT(580);
	
	public final int ProfID;
	
	private WeaponType(int ProfID) {
		this.ProfID = ProfID;
	}
}