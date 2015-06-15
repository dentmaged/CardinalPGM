package in.twizmwaz.cardinal.module.modules.nicks;

import in.twizmwaz.cardinal.match.Match;
import in.twizmwaz.cardinal.module.ModuleBuilder;
import in.twizmwaz.cardinal.module.ModuleCollection;

public class NickBuilder implements ModuleBuilder {

    @Override
    public ModuleCollection<NickModule> load(Match match) {
        ModuleCollection<NickModule> results = new ModuleCollection<NickModule>();
        results.add(new NickModule());
        return results;
    }

}
