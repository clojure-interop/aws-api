(ns com.amazonaws.auth.AWSSessionCredentials
  "AWS session credentials object."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth AWSSessionCredentials]))

(defn get-session-token
  "Returns the session token for this session.

  returns: `java.lang.String`"
  (^java.lang.String [^AWSSessionCredentials this]
    (-> this (.getSessionToken))))

