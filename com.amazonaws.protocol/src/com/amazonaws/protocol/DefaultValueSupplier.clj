(ns com.amazonaws.protocol.DefaultValueSupplier
  "Interface to provide a default value for a null member during marshalling. Currently used for
  members that have the idempotency trait applied and for Glacier's account ID member (which defaults to '-' indicating
  the current account)."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.protocol DefaultValueSupplier]))

(defn get
  "returns: The default value to use if the value is null. - `T`"
  ([^DefaultValueSupplier this]
    (-> this (.get))))

