(ns com.amazonaws.handlers.CredentialsRequestHandler
  "Deprecated.
 Use of this class to retrieve the credentials is unsafe in
  multithreading scenarios. If a client is used across multiple threads,
  there's a possibility of running into a race condition where one handler
  might access the credentials through the reference as another thread is
  updating it. Retrieve the credentials from the handler context instead using
  the HandlerContextKey.AWS_CREDENTIALS key."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.handlers CredentialsRequestHandler]))

(defn ->credentials-request-handler
  "Constructor.

  Deprecated."
  (^CredentialsRequestHandler []
    (new CredentialsRequestHandler )))

(defn set-credentials
  "Deprecated.

  aws-credentials - `com.amazonaws.auth.AWSCredentials`"
  ([^CredentialsRequestHandler this ^com.amazonaws.auth.AWSCredentials aws-credentials]
    (-> this (.setCredentials aws-credentials))))

