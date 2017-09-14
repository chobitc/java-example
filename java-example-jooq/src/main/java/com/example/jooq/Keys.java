/**
 * This class is generated by jOOQ
 */
package com.example.jooq;


import com.example.jooq.tables.Example;
import com.example.jooq.tables.records.ExampleRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>test</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ExampleRecord, Long> IDENTITY_EXAMPLE = Identities0.IDENTITY_EXAMPLE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ExampleRecord> KEY_EXAMPLE_PRIMARY = UniqueKeys0.KEY_EXAMPLE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<ExampleRecord, Long> IDENTITY_EXAMPLE = createIdentity(Example.EXAMPLE, Example.EXAMPLE.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<ExampleRecord> KEY_EXAMPLE_PRIMARY = createUniqueKey(Example.EXAMPLE, "KEY_example_PRIMARY", Example.EXAMPLE.ID);
    }
}
