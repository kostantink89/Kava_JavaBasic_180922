package lesson4;

public class ChineseDynasties {
    public static void main(String[] args) {
        double leeWarriorsAttacks = 13;
        double leeArchersAttacks = 24;
        double leeCavaliersAttacks = 46;
        System.out.println("Dynasty LEE fighters with the following attack stats: "
                + "\nWarriors: " + leeWarriorsAttacks + "\nArchers: " + leeArchersAttacks
                + "\nCavaliers: " + leeCavaliersAttacks);


        double meanWarriorsAttacks = 9;
        double meanArchersAttacks = 35;
        double meanCavaliersAttacks = 12;
        System.out.println("\nDynasty MEAN fighters with the following attack stats: " +
                "\nWarriors: " + meanWarriorsAttacks + "\nArchers: " + meanArchersAttacks
                + "\nCavaliers: " + meanCavaliersAttacks + "\n");

        double totalLeeAttacks = leeWarriorsAttacks + leeArchersAttacks + leeCavaliersAttacks;
        double totalMeanAttacks = meanWarriorsAttacks + meanArchersAttacks + meanCavaliersAttacks;

        double totalLeeFighters = 860 * 3;
        double totalMeanFighters = (860 * 1.5) * 3;

        double generalLeeAttackStats = totalLeeFighters / totalLeeAttacks;
        double generalMeanAttacksStats = totalMeanFighters / totalMeanAttacks;

        System.out.println("General attack stats for LEE Dynasty: " + Math.round(generalLeeAttackStats));
        System.out.println("General attacks stats for MEAN Dynasty: " + Math.round(generalMeanAttacksStats));
        System.out.println("General attacks stats for BOTH Dynasties: " +
                                                 Math.round(generalLeeAttackStats + generalMeanAttacksStats));

    }
}
