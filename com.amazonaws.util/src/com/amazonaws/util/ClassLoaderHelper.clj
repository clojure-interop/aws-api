(ns com.amazonaws.util.ClassLoaderHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util ClassLoaderHelper]))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ClassLoaderHelper c : ClassLoaderHelper.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.util.ClassLoaderHelper[]`"
  ([]
    (ClassLoaderHelper/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.util.ClassLoaderHelper`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.util.ClassLoaderHelper [^java.lang.String name]
    (ClassLoaderHelper/valueOf name)))

(defn *get-resource
  "If classesFirst is false, retrieves the resource via the context class
   loader of the current thread, and if not found, via the class loaders of
   the optionally specified classes in the order of their specification, and
   if not found, from the class loader of ClassLoaderHelper as the
   last resort.

   If classesFirst is true, retrieves the resource via the optionally
   specified classes in the order of their specification, and if not found,
   via the context class loader of the current thread, and if not found,
   from the class loader of ClassLoaderHelper as the last resort.

  resource - resource to be loaded - `java.lang.String`
  classes-first - true if the class loaders of the optionally specified classes take precedence over the context class loader of the current thread; false if the opposite is true. - `boolean`
  classes - class loader providers - `java.lang.Class`

  returns: the resource loaded as an URL or null if not found. - `java.net.URL`"
  (^java.net.URL [^java.lang.String resource ^Boolean classes-first ^java.lang.Class classes]
    (ClassLoaderHelper/getResource resource classes-first classes))
  (^java.net.URL [^java.lang.String resource ^java.lang.Class classes]
    (ClassLoaderHelper/getResource resource classes)))

(defn *load-class
  "If classesFirst is false, loads the class via the context class
   loader of the current thread, and if not found, via the class loaders of
   the optionally specified classes in the order of their specification, and
   if not found, from the caller class loader as the
   last resort.

   If classesFirst is true, loads the class via the optionally
   specified classes in the order of their specification, and if not found,
   via the context class loader of the current thread, and if not found,
   from the caller class loader as the last resort.

  fqcn - fully qualified class name of the target class to be loaded - `java.lang.String`
  classes-first - true if the class loaders of the optionally specified classes take precedence over the context class loader of the current thread; false if the opposite is true. - `boolean`
  classes - class loader providers - `java.lang.Class`

  returns: the class loaded; never null - `java.lang.Class<?>`

  throws: java.lang.ClassNotFoundException - if failed to load the class"
  (^java.lang.Class [^java.lang.String fqcn ^Boolean classes-first ^java.lang.Class classes]
    (ClassLoaderHelper/loadClass fqcn classes-first classes))
  (^java.lang.Class [^java.lang.String fqcn ^java.lang.Class classes]
    (ClassLoaderHelper/loadClass fqcn classes)))

(defn *get-resource-as-stream
  "If classesFirst is false, retrieves the resource as an input stream via
   the context class loader of the current thread, and if not found, via the
   class loaders of the optionally specified classes in the order of their
   specification, and if not found, from the class loader of
   ClassLoaderHelper as the last resort.

   If classesFirst is true, retrieves the resource as an input stream via
   the optionally specified classes in the order of their specification, and
   if not found, via the context class loader of the current thread, and if
   not found, from the class loader of ClassLoaderHelper as the last
   resort.

  resource - resource to be loaded - `java.lang.String`
  classes-first - true if the class loaders of the optionally specified classes take precedence over the context class loader of the current thread; false if the opposite is true. - `boolean`
  classes - class loader providers - `java.lang.Class`

  returns: the resource loaded as an input stream or null if not found. - `java.io.InputStream`"
  (^java.io.InputStream [^java.lang.String resource ^Boolean classes-first ^java.lang.Class classes]
    (ClassLoaderHelper/getResourceAsStream resource classes-first classes))
  (^java.io.InputStream [^java.lang.String resource ^java.lang.Class classes]
    (ClassLoaderHelper/getResourceAsStream resource classes)))

