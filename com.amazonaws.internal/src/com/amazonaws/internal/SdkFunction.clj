(ns com.amazonaws.internal.SdkFunction
  "Similar to the Function functional interface in Java 8."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.internal SdkFunction]))

(defn apply
  "input - `Input`

  returns: `Output`"
  ([^SdkFunction this input]
    (-> this (.apply input))))

