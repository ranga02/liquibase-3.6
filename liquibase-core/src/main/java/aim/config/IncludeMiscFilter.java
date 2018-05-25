package aim.config;

import liquibase.changelog.IncludeAllFilter;

//@TODO : APPDBD - Filter for looking at only files with pattern: /misc/*.sql
public class IncludeMiscFilter implements IncludeAllFilter {

    @Override
    public boolean include(String changeLogPath) {
        String pattern = ".*/misc/.*.sql";
        if (changeLogPath.toLowerCase().matches(pattern)) {
            return true;
        }
        return false;
    }
}
