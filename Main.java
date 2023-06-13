import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<Block> wallBlocks = new ArrayList<>();

        for (int i = 0; i < 10; ++i) {
            wallBlocks.add(new CompositeBlockImpl("Color" + i, "Composite" + i, wallBlocks));
        }

        Wall wall = new Wall(wallBlocks);

        List<Block> foundBlocksByMaterial = wall.findBlocksByMaterial("Composite4");
        Optional<Block> foundBlockByColor = wall.findBlockByColor("Color2");

        System.out.println("Wall blocks: " + wall.count());
        System.out.println("Blocks found with material WoodType4: " + foundBlocksByMaterial.size());
        for (Block block : foundBlocksByMaterial) {
            System.out.println(block.getColor());
        }

        System.out.println("Blocks with color Color2: " + foundBlockByColor.get().getMaterial());

        CompositeBlock compositeBlock = new CompositeBlockImpl("a","a", wallBlocks);
        System.out.println(compositeBlock.getBlocks());
        
        WoodenBlock woodenBlock = new WoodenBlock("a","a", wallBlocks);
        System.out.println(woodenBlock.getBlocks());
    }
}
