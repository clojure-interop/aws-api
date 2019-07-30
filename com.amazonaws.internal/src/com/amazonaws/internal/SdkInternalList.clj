(ns com.amazonaws.internal.SdkInternalList
  "List with auto construct flag to indicate whether it is auto constructed by
  Java SDK."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal SdkInternalList]))

(defn ->sdk-internal-list
  "Constructor.

  c - `java.util.Collection`"
  (^SdkInternalList [^java.util.Collection c]
    (new SdkInternalList c))
  (^SdkInternalList []
    (new SdkInternalList )))

(defn auto-construct?
  "Return true if the list is auto constructed by Java SDK

  returns: `boolean`"
  (^Boolean [^SdkInternalList this]
    (-> this (.isAutoConstruct))))

