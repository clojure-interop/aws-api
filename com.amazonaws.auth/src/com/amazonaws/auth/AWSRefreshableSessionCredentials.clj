(ns com.amazonaws.auth.AWSRefreshableSessionCredentials
  "Session credentials that can be refreshed upon request."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth AWSRefreshableSessionCredentials]))

(defn refresh-credentials
  "Forces a refresh of these session credentials."
  ([^AWSRefreshableSessionCredentials this]
    (-> this (.refreshCredentials))))

