(ns com.amazonaws.auth.SessionCredentialsProviderFactory
  "Session credentials provider factory to share providers across potentially
  many clients."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth SessionCredentialsProviderFactory]))

(defn ->session-credentials-provider-factory
  "Constructor."
  (^SessionCredentialsProviderFactory []
    (new SessionCredentialsProviderFactory )))

(defn *get-session-credentials-provider
  "Gets a session credentials provider for the long-term credentials and
   service endpoint given. These are shared globally to support reuse of
   session tokens.

  long-term-credentials - The long-term AWS account credentials used to initiate a session. - `com.amazonaws.auth.AWSCredentials`
  service-endpoint - The service endpoint for the service the session credentials will be used to access. - `java.lang.String`
  sts-client-configuration - Client configuration for the AWSSecurityTokenService used to fetch session credentials. - `com.amazonaws.ClientConfiguration`

  returns: `com.amazonaws.auth.STSSessionCredentialsProvider`"
  (^com.amazonaws.auth.STSSessionCredentialsProvider [^com.amazonaws.auth.AWSCredentials long-term-credentials ^java.lang.String service-endpoint ^com.amazonaws.ClientConfiguration sts-client-configuration]
    (SessionCredentialsProviderFactory/getSessionCredentialsProvider long-term-credentials service-endpoint sts-client-configuration)))

