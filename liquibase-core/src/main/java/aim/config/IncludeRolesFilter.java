package aim.config;

import liquibase.changelog.IncludeAllFilter;

//@TODO : APPDBD - Filter for looking at only files with pattern: /roles/*.sql
public class IncludeRolesFilter implements IncludeAllFilter {

    @Override
    public boolean include(String changeLogPath) {
        String pattern = ".*/roles/.*.sql";
        if (changeLogPath.toLowerCase().matches(pattern)) {
            return true;
        }
        return false;
    }
}
