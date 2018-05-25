package aim.config;

import liquibase.changelog.IncludeAllFilter;

//@TODO : APPDBD - Filter for looking at only files with pattern: /procs/*.sql
public class IncludeProcsFilter implements IncludeAllFilter {

    @Override
    public boolean include(String changeLogPath) {
        String pattern = ".*/procs/.*.sql";
        if (changeLogPath.toLowerCase().matches(pattern)) {
            return true;
        }
        return false;
    }
}
