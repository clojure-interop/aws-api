(ns com.amazonaws.services.cloudsearchdomain.SwitchToPostHandler
  "Ensures that all SearchRequests use POST instead of GET."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudsearchdomain SwitchToPostHandler]))

(defn ->switch-to-post-handler
  "Constructor."
  (^SwitchToPostHandler []
    (new SwitchToPostHandler )))

(defn before-request
  "Description copied from interface: IRequestHandler2

  request - The low level request being processed. - `com.amazonaws.Request`"
  ([^SwitchToPostHandler this ^com.amazonaws.Request request]
    (-> this (.beforeRequest request))))

