package xz.tankwar.module.tankgenerator;

import xz.tankwar.component.tank.ComTank;
import static xz.tankwar.component.tank.ComTank.ComTankType.*;

public class EngineerSniperWaveGenerator extends AbstractWaveTankGenerator {
  
    public EngineerSniperWaveGenerator(int difficulty) {
        for (int i = 0; i < difficulty / 3 + 1; ++i) {
            if (i < difficulty / 6)
                tankList.add(new ComTank(ENGINEER, i % 4));
            else
                tankList.add(new ComTank(SNIPER, i % 4));
        }
    }

}
