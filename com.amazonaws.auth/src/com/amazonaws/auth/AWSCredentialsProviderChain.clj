(ns com.amazonaws.auth.AWSCredentialsProviderChain
  "AWSCredentialsProvider implementation that chains together multiple
  credentials providers. When a caller first requests credentials from this provider,
  it calls all the providers in the chain, in the original order specified,
  until one can provide credentials, and then returns those credentials. If all
  of the credential providers in the chain have been called, and none of them
  can provide credentials, then this class will throw an exception indicated
  that no credentials are available.

  By default, this class will remember the first credentials provider in the chain
  that was able to provide credentials, and will continue to use that provider when
  credentials are requested in the future, instead of traversing the chain each time.
  This behavior can be controlled through the setReuseLastProvider(boolean) method."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth AWSCredentialsProviderChain]))

(defn ->aws-credentials-provider-chain
  "Constructor.

  Constructs a new AWSCredentialsProviderChain with the specified credential providers. When
   credentials are requested from this provider, it will call each of these credential providers
   in the same order specified here until one of them returns AWS security credentials.

  credentials-providers - The chain of credentials providers. - `java.util.List`"
  (^AWSCredentialsProviderChain [^java.util.List credentials-providers]
    (new AWSCredentialsProviderChain credentials-providers)))

(defn get-reuse-last-provider?
  "Returns true if this chain will reuse the last successful credentials
   provider for future credentials requests, otherwise, false if it will
   search through the chain each time.

  returns: True if this chain will reuse the last successful credentials
           provider for future credentials requests. - `boolean`"
  (^Boolean [^AWSCredentialsProviderChain this]
    (-> this (.getReuseLastProvider))))

(defn set-reuse-last-provider
  "Enables or disables caching of the last successful credentials provider
   in this chain. Reusing the last successful credentials provider will
   typically return credentials faster than searching through the chain.

  b - Whether to enable or disable reusing the last successful credentials provider for future credentials requests instead of searching through the whole chain. - `boolean`"
  ([^AWSCredentialsProviderChain this ^Boolean b]
    (-> this (.setReuseLastProvider b))))

(defn get-credentials
  "Description copied from interface: AWSCredentialsProvider

  returns: AWSCredentials which the caller can use to authorize an AWS request. - `com.amazonaws.auth.AWSCredentials`"
  (^com.amazonaws.auth.AWSCredentials [^AWSCredentialsProviderChain this]
    (-> this (.getCredentials))))

(defn refresh
  "Description copied from interface: AWSCredentialsProvider"
  ([^AWSCredentialsProviderChain this]
    (-> this (.refresh))))

