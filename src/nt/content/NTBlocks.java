package mindustry.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.PayloadConveyor;
import mindustry.world.blocks.payloads.PayloadRouter;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.type.ItemStack.*;

public class NTBlocks{
  public static Block
    
  // erekir - core
  worldRadar;
  
  public static void load(){
    // reg erekir - core
    worldRadar = new Radar("world-radar"){{
      requirements(Category.effect, BuildVisibility.fogOnly, with(Items.silicon, 180, Items.graphite, 50, Items.beryllium, 10));
      outlineColor = Color.valueOf("4a4b53");
      fogRadius = 560;
      size = 3;
      health = 4 * size * size;
      researchCost = with(Items.silicon, 70, Items.graphite, 100, Items.tungsten, 70);

      consumePower(2f);
      
      // endregion
    }};
  }
}
