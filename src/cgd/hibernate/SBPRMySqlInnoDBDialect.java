package cgd.hibernate;

import org.hibernate.dialect.MySQL5InnoDBDialect;


/**
 * Usamos o link abaixo para sobrescrever o Dialect da enginne InnoDB do MySQL.
 * Origem: http://stackoverflow.com/questions/12054422/unsuccessful-alter-table-xxx-drop-constraint-yyy-in-hibernate-jpa-hsqldb-standa
 * @author SBPR
 */
public class SBPRMySqlInnoDBDialect extends MySQL5InnoDBDialect {
    @Override
    public String getDropSequenceString(String sequenceName) {
        // Adding the "if exists" clause to avoid warnings
        return "drop sequence if exists " + sequenceName;
    }

    @Override
    public boolean dropConstraints() {
        // We don't need to drop constraints before dropping tables, that just leads to error
        // messages about missing tables when we don't have a schema in the database
        return false;
    }
}
