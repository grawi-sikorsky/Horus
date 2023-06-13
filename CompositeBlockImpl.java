import java.util.List;

public class CompositeBlockImpl implements CompositeBlock {
        String color;
        String material;
        List<Block> blocks;

        public CompositeBlockImpl(String color, String material, List<Block> wallBlocks) {
                this.blocks = wallBlocks;
                this.color = color;
                this.material = material;
        }

        public CompositeBlockImpl(String color, String material) {
                this.color = color;
                this.material = material;
        }

        public CompositeBlockImpl() {
        }

        @Override
        public List<Block> getBlocks() {
                return blocks;
        }

        @Override
        public String getColor() {
                return color;
        }

        @Override
        public String getMaterial() {
                return material;
        }
}
