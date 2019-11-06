public class MineSweeper {
    public static void main(String[] args) {
        String[][] map = {
                {"*", "."}
        };

        final int MAP_WIDTH = map[0].length;

        String[][] mapReport = new String[1][MAP_WIDTH];
        for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
            String curentCell = map[0][xOrdinate];
            if (curentCell.equals("*")) mapReport[0][xOrdinate] = "*";
            else mapReport[0][xOrdinate] = "1";
        }

        for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
            String currentCellReport = mapReport[0][xOrdinate];
            System.out.print(currentCellReport);
        }
    }
}
