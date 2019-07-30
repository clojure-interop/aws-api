(ns com.amazonaws.util.JavaVersionParser$KnownJavaVersions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util JavaVersionParser$KnownJavaVersions]))

(def JAVA_6
  "Enum Constant.

  type: com.amazonaws.util.JavaVersionParser$KnownJavaVersions"
  JavaVersionParser$KnownJavaVersions/JAVA_6)

(def JAVA_7
  "Enum Constant.

  type: com.amazonaws.util.JavaVersionParser$KnownJavaVersions"
  JavaVersionParser$KnownJavaVersions/JAVA_7)

(def JAVA_8
  "Enum Constant.

  type: com.amazonaws.util.JavaVersionParser$KnownJavaVersions"
  JavaVersionParser$KnownJavaVersions/JAVA_8)

(def JAVA_9
  "Enum Constant.

  type: com.amazonaws.util.JavaVersionParser$KnownJavaVersions"
  JavaVersionParser$KnownJavaVersions/JAVA_9)

(def UNKNOWN
  "Enum Constant.

  type: com.amazonaws.util.JavaVersionParser$KnownJavaVersions"
  JavaVersionParser$KnownJavaVersions/UNKNOWN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (JavaVersionParser.KnownJavaVersions c : JavaVersionParser.KnownJavaVersions.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.util.JavaVersionParser$KnownJavaVersions[]`"
  ([]
    (JavaVersionParser$KnownJavaVersions/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.util.JavaVersionParser$KnownJavaVersions`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.util.JavaVersionParser$KnownJavaVersions [^java.lang.String name]
    (JavaVersionParser$KnownJavaVersions/valueOf name)))

(defn *from-major-version
  "Tries to determine a known version from the parsed major version components

  major-version-family - Major version family of the JVM. Currently only 1 is known (i.e. '1.7') - `java.lang.Integer`
  major-version - Major version of JVM (6, 7, 8, etc) - `java.lang.Integer`

  returns: A JavaVersionParser.KnownJavaVersions or UNKNOWN if unable to
           determine - `com.amazonaws.util.JavaVersionParser$KnownJavaVersions`"
  (^com.amazonaws.util.JavaVersionParser$KnownJavaVersions [^java.lang.Integer major-version-family ^java.lang.Integer major-version]
    (JavaVersionParser$KnownJavaVersions/fromMajorVersion major-version-family major-version)))

