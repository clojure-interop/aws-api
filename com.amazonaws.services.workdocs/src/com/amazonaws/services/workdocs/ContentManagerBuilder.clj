(ns com.amazonaws.services.workdocs.ContentManagerBuilder
  "Fluent builder for ContentManager.
  Use of the builder is required instead of constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workdocs ContentManagerBuilder]))

(defn ->content-manager-builder
  "Constructor."
  (^ContentManagerBuilder []
    (new ContentManagerBuilder )))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.workdocs.ContentManagerBuilder`"
  (^com.amazonaws.services.workdocs.ContentManagerBuilder []
    (ContentManagerBuilder/standard )))

(defn *default-content-manager
  "returns: Default client. - `com.amazonaws.services.workdocs.ContentManager`"
  (^com.amazonaws.services.workdocs.ContentManager []
    (ContentManagerBuilder/defaultContentManager )))

(defn with-work-docs-client
  "Sets the low level client used to make the service calls to Amazon
   WorkDocs. If no client is specified, a default client will be created.

  work-docs-client - Client implementation to use. - `com.amazonaws.services.workdocs.AmazonWorkDocs`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.ContentManagerBuilder`"
  (^com.amazonaws.services.workdocs.ContentManagerBuilder [^ContentManagerBuilder this ^com.amazonaws.services.workdocs.AmazonWorkDocs work-docs-client]
    (-> this (.withWorkDocsClient work-docs-client))))

(defn set-work-docs-client
  "Sets the low level client used to make the service calls to Amazon
   WorkDocs. If no client is specified, a default client will be created.

  work-docs-client - Client implementation to use. - `com.amazonaws.services.workdocs.AmazonWorkDocs`"
  ([^ContentManagerBuilder this ^com.amazonaws.services.workdocs.AmazonWorkDocs work-docs-client]
    (-> this (.setWorkDocsClient work-docs-client))))

(defn get-work-docs-client
  "Gets WorkDocs client.

  returns: WorkDocs client implementation. - `com.amazonaws.services.workdocs.AmazonWorkDocs`"
  (^com.amazonaws.services.workdocs.AmazonWorkDocs [^ContentManagerBuilder this]
    (-> this (.getWorkDocsClient))))

(defn with-authentication-token
  "Sets authentication token for Amazon WorkDocs calls. This is used only
   for user-level APIs.

  authentication-token - Token retrieved by OAuth flow. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.ContentManagerBuilder`"
  (^com.amazonaws.services.workdocs.ContentManagerBuilder [^ContentManagerBuilder this ^java.lang.String authentication-token]
    (-> this (.withAuthenticationToken authentication-token))))

(defn set-authentication-token
  "Sets authentication token for Amazon WorkDocs calls. This is used only
   for user-level APIs.

  authentication-token - Token retrieved by OAuth flow. - `java.lang.String`"
  ([^ContentManagerBuilder this ^java.lang.String authentication-token]
    (-> this (.setAuthenticationToken authentication-token))))

(defn get-authentication-token
  "Gets authentication token for Amazon WorkDocs calls.

  returns: Token retrieved by OAuth flow. - `java.lang.String`"
  (^java.lang.String [^ContentManagerBuilder this]
    (-> this (.getAuthenticationToken))))

(defn build
  "Construct ContentManager using the current builder configuration.

  returns: ContentManager object. - `com.amazonaws.services.workdocs.ContentManager`"
  (^com.amazonaws.services.workdocs.ContentManager [^ContentManagerBuilder this]
    (-> this (.build))))

