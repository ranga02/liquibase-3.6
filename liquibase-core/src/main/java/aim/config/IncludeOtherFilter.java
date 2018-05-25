package aim.config;

import liquibase.changelog.IncludeAllFilter;

//@TODO : APPDBD - Filter for looking at only at non standard folders
public class IncludeOtherFilter implements IncludeAllFilter {

    @Override
    public boolean include(String changeLogPath) {
        String pattern = ".*/(tables|views|procs|constraints|mviews|indexes|grants|misc|dml|users|roles)/.*.sql";
        if (!changeLogPath.toLowerCase().matches(pattern)) {
            return true;
        }
        return false;
    }
}
