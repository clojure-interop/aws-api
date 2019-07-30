(ns com.amazonaws.services.cloud9.AWSCloud9Async
  "Interface for accessing AWS Cloud9 asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCloud9Async instead.


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
  (:import [com.amazonaws.services.cloud9 AWSCloud9Async]))

(defn describe-environment-memberships-async
  "Gets information about environment members for an AWS Cloud9 development environment.

  describe-environment-memberships-request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironmentMemberships operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsResult>`"
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest describe-environment-memberships-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentMembershipsAsync describe-environment-memberships-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentMembershipsRequest describe-environment-memberships-request]
    (-> this (.describeEnvironmentMembershipsAsync describe-environment-memberships-request))))

(defn update-environment-async
  "Changes the settings of an existing AWS Cloud9 development environment.

  update-environment-request - `com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.UpdateEnvironmentResult>`"
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest update-environment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEnvironmentAsync update-environment-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentRequest update-environment-request]
    (-> this (.updateEnvironmentAsync update-environment-request))))

(defn create-environment-ec-2-async
  "Creates an AWS Cloud9 development environment, launches an Amazon Elastic Compute Cloud (Amazon EC2) instance,
   and then connects from the instance to the environment.

  create-environment-ec-2-request - `com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEnvironmentEC2 operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Result>`"
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request create-environment-ec-2-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEnvironmentEC2Async create-environment-ec-2-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.CreateEnvironmentEC2Request create-environment-ec-2-request]
    (-> this (.createEnvironmentEC2Async create-environment-ec-2-request))))

(defn delete-environment-async
  "Deletes an AWS Cloud9 development environment. If an Amazon EC2 instance is connected to the environment, also
   terminates the instance.

  delete-environment-request - `com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEnvironment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.DeleteEnvironmentResult>`"
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest delete-environment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEnvironmentAsync delete-environment-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentRequest delete-environment-request]
    (-> this (.deleteEnvironmentAsync delete-environment-request))))

(defn list-environments-async
  "Gets a list of AWS Cloud9 development environment identifiers.

  list-environments-request - `com.amazonaws.services.cloud9.model.ListEnvironmentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEnvironments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.ListEnvironmentsResult>`"
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.ListEnvironmentsRequest list-environments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEnvironmentsAsync list-environments-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.ListEnvironmentsRequest list-environments-request]
    (-> this (.listEnvironmentsAsync list-environments-request))))

(defn describe-environment-status-async
  "Gets status information for an AWS Cloud9 development environment.

  describe-environment-status-request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironmentStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusResult>`"
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest describe-environment-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentStatusAsync describe-environment-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentStatusRequest describe-environment-status-request]
    (-> this (.describeEnvironmentStatusAsync describe-environment-status-request))))

(defn delete-environment-membership-async
  "Deletes an environment member from an AWS Cloud9 development environment.

  delete-environment-membership-request - `com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEnvironmentMembership operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipResult>`"
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest delete-environment-membership-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEnvironmentMembershipAsync delete-environment-membership-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.DeleteEnvironmentMembershipRequest delete-environment-membership-request]
    (-> this (.deleteEnvironmentMembershipAsync delete-environment-membership-request))))

(defn create-environment-membership-async
  "Adds an environment member to an AWS Cloud9 development environment.

  create-environment-membership-request - `com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEnvironmentMembership operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipResult>`"
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest create-environment-membership-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEnvironmentMembershipAsync create-environment-membership-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.CreateEnvironmentMembershipRequest create-environment-membership-request]
    (-> this (.createEnvironmentMembershipAsync create-environment-membership-request))))

(defn describe-environments-async
  "Gets information about AWS Cloud9 development environments.

  describe-environments-request - `com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEnvironments operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.DescribeEnvironmentsResult>`"
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest describe-environments-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEnvironmentsAsync describe-environments-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.DescribeEnvironmentsRequest describe-environments-request]
    (-> this (.describeEnvironmentsAsync describe-environments-request))))

(defn update-environment-membership-async
  "Changes the settings of an existing environment member for an AWS Cloud9 development environment.

  update-environment-membership-request - `com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEnvironmentMembership operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipResult>`"
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest update-environment-membership-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEnvironmentMembershipAsync update-environment-membership-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloud9Async this ^com.amazonaws.services.cloud9.model.UpdateEnvironmentMembershipRequest update-environment-membership-request]
    (-> this (.updateEnvironmentMembershipAsync update-environment-membership-request))))

