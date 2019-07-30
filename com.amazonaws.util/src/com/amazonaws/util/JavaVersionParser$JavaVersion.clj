(ns com.amazonaws.util.JavaVersionParser$JavaVersion
  "Struct like class representing a specific version of Java. Contains the major and minor
  version identifiers and a descriptive enum identifying which major version this JVM belongs
  to if we are able to identify it"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util JavaVersionParser$JavaVersion]))

(defn ->java-version
  "Constructor.

  major-version-family - `java.lang.Integer`
  major-version - `java.lang.Integer`
  maintenance-number - `java.lang.Integer`
  update-number - `java.lang.Integer`"
  (^JavaVersionParser$JavaVersion [^java.lang.Integer major-version-family ^java.lang.Integer major-version ^java.lang.Integer maintenance-number ^java.lang.Integer update-number]
    (new JavaVersionParser$JavaVersion major-version-family major-version maintenance-number update-number)))

(def *-unknown
  "Static Constant.

  type: com.amazonaws.util.JavaVersionParser$JavaVersion"
  JavaVersionParser$JavaVersion/UNKNOWN)

(defn get-known-version
  "returns: JavaVersionParser.KnownJavaVersions representing the major version of the Java version if
           it's identifiable - `com.amazonaws.util.JavaVersionParser$KnownJavaVersions`"
  (^com.amazonaws.util.JavaVersionParser$KnownJavaVersions [^JavaVersionParser$JavaVersion this]
    (-> this (.getKnownVersion))))

(defn get-major-version-string
  "returns: Major version string if available. Examples include '1.6', '1.7', '1.8' - `java.lang.String`"
  (^java.lang.String [^JavaVersionParser$JavaVersion this]
    (-> this (.getMajorVersionString))))

(defn get-update-number
  "returns: Update number of Java version. If the version is '1.6.1_20' then '20' is the
           update number - `java.lang.Integer`"
  (^java.lang.Integer [^JavaVersionParser$JavaVersion this]
    (-> this (.getUpdateNumber))))

(defn get-major-version-family
  "returns: Major version family if available. I.E. if the major version family string is
           '1.7.0_60' then the major version family will be 1 - `java.lang.Integer`"
  (^java.lang.Integer [^JavaVersionParser$JavaVersion this]
    (-> this (.getMajorVersionFamily))))

(defn hash-code
  "returns: `int`"
  (^Integer [^JavaVersionParser$JavaVersion this]
    (-> this (.hashCode))))

(defn get-maintenance-number
  "returns: Maintenance number of Java version. If the version is '1.6.1_20' then '1' is the
           maintenance number - `java.lang.Integer`"
  (^java.lang.Integer [^JavaVersionParser$JavaVersion this]
    (-> this (.getMaintenanceNumber))))

(defn get-major-version
  "returns: Major version ordinal if available. Examples include '6', '7', '8' - `java.lang.Integer`"
  (^java.lang.Integer [^JavaVersionParser$JavaVersion this]
    (-> this (.getMajorVersion))))

(defn compare-to
  "other - `com.amazonaws.util.JavaVersionParser$JavaVersion`

  returns: `int`"
  (^Integer [^JavaVersionParser$JavaVersion this ^com.amazonaws.util.JavaVersionParser$JavaVersion other]
    (-> this (.compareTo other))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^JavaVersionParser$JavaVersion this ^java.lang.Object obj]
    (-> this (.equals obj))))

