package aim.config;

import liquibase.changelog.IncludeAllFilter;

//@TODO : APPDBD - Filter for looking at only files with pattern: /users/*.sql
public class IncludeUsersFilter implements IncludeAllFilter {

    @Override
    public boolean include(String changeLogPath) {
        String pattern = ".*/users/.*.sql";
        if (changeLogPath.toLowerCase().matches(pattern)) {
            return true;
        }
        return false;
    }
}
