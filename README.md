# WordWolfShared
WordWolf code shared between client and server

Hello! Welcome to the shared object code for WordWolf, an Android app written in Java, with a complementary Java socket server on the backend, a project by Jason Mortara.

The code in this project is not runnable; it is a package of serializable Java objects which are exported into a JAR and used as a library by BOTH the client Android app and the Java server. Serialization allows Java objects to be understood natively by both the client and server as Java objects, with no parsing or translation libraries needed. So Strings, longs, doubles, nulls, etc are all sent out and received as Strings, longs, doubles, nulls, etc. Perhaps most importantly, nesting of objects and lists of objects also remain intact. Native objects go out; native objects come in. No parsing means less work, more reliable code, and quicker development time!

-Jason Mortara, 2016

