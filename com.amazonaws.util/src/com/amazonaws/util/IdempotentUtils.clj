(ns com.amazonaws.util.IdempotentUtils
  "Utility class to manage idempotency token"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.util IdempotentUtils]))

(defn ->idempotent-utils
  "Constructor."
  (^IdempotentUtils []
    (new IdempotentUtils )))

(defn *resolve-string
  "Deprecated. By getGenerator()

  token - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String token]
    (IdempotentUtils/resolveString token)))

(defn *get-generator
  "returns: `com.amazonaws.protocol.DefaultValueSupplier<java.lang.String>`"
  (^com.amazonaws.protocol.DefaultValueSupplier []
    (IdempotentUtils/getGenerator )))

(defn *set-generator
  "new-generator - `com.amazonaws.protocol.DefaultValueSupplier`"
  ([^com.amazonaws.protocol.DefaultValueSupplier new-generator]
    (IdempotentUtils/setGenerator new-generator)))

