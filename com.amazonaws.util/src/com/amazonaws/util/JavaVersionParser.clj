(ns com.amazonaws.util.JavaVersionParser
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util JavaVersionParser]))

(def *-java-version-property
  "Static Constant.

  type: java.lang.String"
  JavaVersionParser/JAVA_VERSION_PROPERTY)

(defn *get-current-java-version
  "returns: The JavaVersionParser.JavaVersion of this JVM. - `com.amazonaws.util.JavaVersionParser$JavaVersion`"
  (^com.amazonaws.util.JavaVersionParser$JavaVersion []
    (JavaVersionParser/getCurrentJavaVersion )))

(defn *parse-java-version
  "full-version-string - `java.lang.String`

  returns: `com.amazonaws.util.JavaVersionParser$JavaVersion`"
  (^com.amazonaws.util.JavaVersionParser$JavaVersion [^java.lang.String full-version-string]
    (JavaVersionParser/parseJavaVersion full-version-string)))

