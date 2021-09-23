package Task1_Factory;

/**
 * The factory class which produces Vandral battalions according to the schema provided.
 * Please note that you may edit this class as much as you like (create helper methods if you want!). So long as you genuinely pass the tests.
 * Ask questions if you are lost or unsure!
 */
public class VandralBattalionFactory {
    /*
    Copy of schema:
        At easy difficulty:
        - For every even level, an additional muggle is spawned.
        - For every 20 Muggles, 3 Low-Archons or 1 High-Archon an additional healer is spawned.
        - For every 5 levels up until level 75 a Low-Archon is spawned.
        - Beyond level 75, every 5 levels a High-Archon is spawned.

        At hard difficulty:
        - All spawn rates, except for healers, are halved rounding down.
        - Note that you will still spawn Low-Archons up until 75 and then High-Archons.

        For examples, please look at the lab slides.
     */

    /**
     * Creates a battalion to fight against!
     * @param difficulty set by user
     * @param playerLevel level that player is currently at between 1 and 100 inclusive
     * @return a Vandral battalion according to the schema
     * @throws Exception if the player level is not within 1 and 100 inclusive
     */
    public static VandralBattalion createVandralBattalion(Difficulty difficulty, int playerLevel)
            throws Exception {

        // We have done the exception handling for you. :)
        if (playerLevel < 1 || playerLevel > 100) {
            throw new Exception("Player level out of bounds");
        }

        // TODO: complete this method
        if (difficulty == Difficulty.HARD){
            int numMuggle = playerLevel;
            int numLowArchon = Math.min(75/2,playerLevel/2);
            int numHighArchon = Math.max(0, playerLevel/2 - 76/2);
            int numHealer = numMuggle/20 + numLowArchon/3 +numHighArchon;
            return new VandralBattalion(numMuggle,numHealer,numLowArchon,numHighArchon);

        } else {
            int numMuggle = playerLevel/2;
            int numLowArchon = Math.min(15,playerLevel/5);
            int numHighArchon = Math.max(0, playerLevel/5 - 15);
            int numHealer = numMuggle/20 + numLowArchon/3 +numHighArchon;
            return new VandralBattalion(numMuggle,numHealer,numLowArchon,numHighArchon);

        }
    }
}
