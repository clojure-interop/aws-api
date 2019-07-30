(ns com.amazonaws.services.cloud9.AWSCloud9AsyncClient
  "Client for accessing AWS Cloud9 asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS Cloud9

  AWS Cloud9 is a collection of tools that you can use to code, build, run, test, debug, and release software in the
  cloud.


  For more information about AWS Cloud9, see the AWS
  Cloud9 User Guide.


  AWS Cloud9 supports these operations:




  CreateEnvironmentEC2: Creates an AWS Cloud9 development environment, launches an Amazon EC2 instance,
  and then connects from the instance to the environment.




  CreateEnvironmentMembership: Adds an environment member to an environment.




  DeleteEnvironment: Deletes an environment. If an Amazon EC2 instance is connected to the environment,
  also terminates the instance.




  DeleteEnvironmentMembership: Deletes an environment member from an environment.




  DescribeEnvironmentMemberships: Gets information about environment members for an environment.




  DescribeEnvironments: Gets information about environments.




  DescribeEnvironmentStatus: Gets status information for an environment.




  ListEnvironments: Gets a list of environment identifiers.




  UpdateEnvironment: Changes the settings of an existing environment.




  UpdateEnvironmentMembership: Changes the settings of an existing environment member for an environment."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloud9 AWSCloud9AsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.cloud9.AWSCloud9AsyncClientBuilder`"
  (^com.amazonaws.services.cloud9.AWSCloud9AsyncClientBuilder []
    (AWSCloud9AsyncClient/asyncBuilder )))

(defn describe-environment-memberships-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironmentMemberships operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsResult>`"
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentMembershipsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest request]
    (-> this (.describeEnvironmentMembershipsAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSCloud9AsyncClient this]
    (-> this (.getExecutorService))))

(defn update-environment-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.UpdateEnvironmentResult>`"
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEnvironmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest request]
    (-> this (.updateEnvironmentAsync request))))

(defn create-environment-ec-2-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEnvironmentEC2 operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Result>`"
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEnvironmentEC2Async request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request request]
    (-> this (.createEnvironmentEC2Async request))))

(defn delete-environment-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.DeleteEnvironmentResult>`"
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEnvironmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest request]
    (-> this (.deleteEnvironmentAsync request))))

(defn list-environments-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.ListEnvironmentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEnvironments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.ListEnvironmentsResult>`"
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.ListEnvironmentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEnvironmentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.ListEnvironmentsRequest request]
    (-> this (.listEnvironmentsAsync request))))

(defn describe-environment-status-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironmentStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusResult>`"
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest request]
    (-> this (.describeEnvironmentStatusAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSCloud9AsyncClient this]
    (-> this (.shutdown))))

(defn delete-environment-membership-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEnvironmentMembership operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipResult>`"
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEnvironmentMembershipAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest request]
    (-> this (.deleteEnvironmentMembershipAsync request))))

(defn create-environment-membership-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEnvironmentMembership operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipResult>`"
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEnvironmentMembershipAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest request]
    (-> this (.createEnvironmentMembershipAsync request))))

(defn describe-environments-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.DescribeEnvironmentsResult>`"
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest request]
    (-> this (.describeEnvironmentsAsync request))))

(defn update-environment-membership-async
  "Description copied from interface: AWSCloud9Async

  request - `com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEnvironmentMembership operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipResult>`"
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEnvironmentMembershipAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9AsyncClient this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest request]
    (-> this (.updateEnvironmentMembershipAsync request))))

