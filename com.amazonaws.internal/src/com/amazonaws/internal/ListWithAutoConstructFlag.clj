(ns com.amazonaws.internal.ListWithAutoConstructFlag
  "List with auto construct flag to indicate whether it is auto constructed by Java SDK."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal ListWithAutoConstructFlag]))

(defn ->list-with-auto-construct-flag
  "Constructor.

  c - `java.util.Collection`"
  (^ListWithAutoConstructFlag [^java.util.Collection c]
    (new ListWithAutoConstructFlag c))
  (^ListWithAutoConstructFlag []
    (new ListWithAutoConstructFlag )))

(defn set-auto-construct
  "auto-construct - `boolean`"
  ([^ListWithAutoConstructFlag this ^Boolean auto-construct]
    (-> this (.setAutoConstruct auto-construct))))

(defn auto-construct?
  "Return true if the list is auto constructed by Java SDK

  returns: `boolean`"
  (^Boolean [^ListWithAutoConstructFlag this]
    (-> this (.isAutoConstruct))))

