(ns com.amazonaws.util.AWSServiceMetrics
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util AWSServiceMetrics]))

(def HttpClientGetConnectionTime
  "Enum Constant.

  Time taken to get a connection by the http client library.

  type: com.amazonaws.util.AWSServiceMetrics"
  AWSServiceMetrics/HttpClientGetConnectionTime)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (AWSServiceMetrics c : AWSServiceMetrics.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.amazonaws.util.AWSServiceMetrics[]`"
  ([]
    (AWSServiceMetrics/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.amazonaws.util.AWSServiceMetrics`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.amazonaws.util.AWSServiceMetrics [^java.lang.String name]
    (AWSServiceMetrics/valueOf name)))

(defn get-service-name
  "returns: `java.lang.String`"
  (^java.lang.String [^AWSServiceMetrics this]
    (-> this (.getServiceName))))

