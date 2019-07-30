(ns com.amazonaws.services.workdocs.ContentManagerAsyncBuilder
  "Fluent builder for ContentManagerAsync.
  Use of the builder is required instead of constructors of the client class."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.workdocs ContentManagerAsyncBuilder]))

(defn ->content-manager-async-builder
  "Constructor."
  (^ContentManagerAsyncBuilder []
    (new ContentManagerAsyncBuilder )))

(defn *standard
  "returns: Create new instance of builder with all defaults set. - `com.amazonaws.services.workdocs.ContentManagerAsyncBuilder`"
  (^com.amazonaws.services.workdocs.ContentManagerAsyncBuilder []
    (ContentManagerAsyncBuilder/standard )))

(defn *default-content-manager
  "returns: Default client. - `com.amazonaws.services.workdocs.ContentManagerAsync`"
  (^com.amazonaws.services.workdocs.ContentManagerAsync []
    (ContentManagerAsyncBuilder/defaultContentManager )))

(defn with-executor-service
  "Sets executor service used for asynchronous calls.

  executor-service - Executor service. - `java.util.concurrent.ExecutorService`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.ContentManagerAsyncBuilder`"
  (^com.amazonaws.services.workdocs.ContentManagerAsyncBuilder [^ContentManagerAsyncBuilder this ^java.util.concurrent.ExecutorService executor-service]
    (-> this (.withExecutorService executor-service))))

(defn set-executor-service
  "Sets executor service used for asynchronous calls.

  executor-service - Executor service. - `java.util.concurrent.ExecutorService`"
  ([^ContentManagerAsyncBuilder this ^java.util.concurrent.ExecutorService executor-service]
    (-> this (.setExecutorService executor-service))))

(defn get-executor-service
  "Gets executor service used for asynchronous calls.

  returns: Executor service. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^ContentManagerAsyncBuilder this]
    (-> this (.getExecutorService))))

(defn with-authentication-token
  "Sets authentication token for Amazon WorkDocs calls. This is used only
   for user-level APIs.

  authentication-token - Token retrieved by OAuth flow. - `java.lang.String`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.ContentManagerAsyncBuilder`"
  (^com.amazonaws.services.workdocs.ContentManagerAsyncBuilder [^ContentManagerAsyncBuilder this ^java.lang.String authentication-token]
    (-> this (.withAuthenticationToken authentication-token))))

(defn with-work-docs-client
  "Sets the low level client used to make the service calls to Amazon
   WorkDocs. If no client is specified, a default client will be created.

  work-docs-client - Client implementation to use. - `com.amazonaws.services.workdocs.AmazonWorkDocs`

  returns: This object for method chaining. - `com.amazonaws.services.workdocs.ContentManagerAsyncBuilder`"
  (^com.amazonaws.services.workdocs.ContentManagerAsyncBuilder [^ContentManagerAsyncBuilder this ^com.amazonaws.services.workdocs.AmazonWorkDocs work-docs-client]
    (-> this (.withWorkDocsClient work-docs-client))))

(defn build
  "Construct ContentManager using the current builder configuration.

  returns: ContentManager object. - `com.amazonaws.services.workdocs.ContentManagerAsync`"
  (^com.amazonaws.services.workdocs.ContentManagerAsync [^ContentManagerAsyncBuilder this]
    (-> this (.build))))

