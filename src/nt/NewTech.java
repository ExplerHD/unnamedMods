package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class NewTech extends Mod{

    public NewTech(){
        Log.info("Loaded NewTech constructor.");
    }

    @Override
    public void loadContent(){
//        NTStatus.load();
//        NTItemLiquid.load();
//        NTBullets.load();
//        NTUnits.load();
        NTBlocks.load();
    }

}
