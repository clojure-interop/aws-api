(ns com.amazonaws.ReadLimitInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws ReadLimitInfo]))

(defn get-read-limit
  "Returns the read limit for mark-and-reset during retries; or -1 if not
   available.

  returns: `int`"
  (^Integer [^ReadLimitInfo this]
    (-> this (.getReadLimit))))

