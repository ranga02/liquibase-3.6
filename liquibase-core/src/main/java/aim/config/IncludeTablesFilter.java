package aim.config;

import liquibase.changelog.IncludeAllFilter;

//@TODO : APPDBD - Filter for looking at only at files with pattern: /tables/*.sql
public class IncludeTablesFilter implements IncludeAllFilter {

    @Override
    public boolean include(String changeLogPath) {
        String pattern = ".*/tables/.*.sql";
        if (changeLogPath.toLowerCase().matches(pattern)) {
            return true;
        }
        return false;
    }
}
