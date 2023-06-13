import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {
        private List<Block> blocks;

        public Wall(List<Block> blocks) {
            this.blocks = blocks;
            System.out.println(blocks);
        }

        @Override
        public Optional<Block> findBlockByColor(String color) {
            return blocks.stream().filter(e -> color.equals(e.getColor())).findAny();
        }

        @Override
        public List<Block> findBlocksByMaterial(String material) {
            return blocks.stream().filter(e -> material.equals(e.getMaterial())).collect(Collectors.toList());
        }

        @Override
        public int count() {
            return blocks.size();
        }
}
