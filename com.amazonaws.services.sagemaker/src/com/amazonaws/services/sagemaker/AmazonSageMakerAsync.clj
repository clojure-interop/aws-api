(ns com.amazonaws.services.sagemaker.AmazonSageMakerAsync
  "Interface for accessing SageMaker asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonSageMakerAsync instead.



  Provides APIs for creating and managing Amazon SageMaker resources."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sagemaker AmazonSageMakerAsync]))

(defn create-labeling-job-async
  "Creates a job that uses workers to label the data objects in your input dataset. You can use the labeled data to
   train machine learning models.


   You can select your workforce from one of three providers:




   A private workforce that you create. It can include employees, contractors, and outside experts. Use a private
   workforce when want the data to stay within your organization or when a specific set of skills is required.




   One or more vendors that you select from the AWS Marketplace. Vendors provide expertise in specific areas.




   The Amazon Mechanical Turk workforce. This is the largest workforce, but it should only be used for public data
   or data that has been stripped of any personally identifiable information.




   You can also use automated data labeling to reduce the number of data objects that need to be labeled by a
   human. Automated data labeling uses active learning to determine if a data object can be labeled by
   machine or if it needs to be sent to a human worker. For more information, see Using Automated Data
   Labeling.


   The data objects to be labeled are contained in an Amazon S3 bucket. You create a manifest file that
   describes the location of each object. For more information, see Using Input and Output Data.


   The output can be used as the manifest file for another labeling job or as training data for your machine
   learning models.

  create-labeling-job-request - `com.amazonaws.services.sagemaker.model.CreateLabelingJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLabelingJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateLabelingJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateLabelingJobRequest create-labeling-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLabelingJobAsync create-labeling-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateLabelingJobRequest create-labeling-job-request]
    (-> this (.createLabelingJobAsync create-labeling-job-request))))

(defn create-hyper-parameter-tuning-job-async
  "Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best version of a model by running many
   training jobs on your dataset using the algorithm you choose and values for hyperparameters within ranges that
   you specify. It then chooses the hyperparameter values that result in a model that performs the best, as measured
   by an objective metric that you choose.

  create-hyper-parameter-tuning-job-request - `com.amazonaws.services.sagemaker.model.CreateHyperParameterTuningJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHyperParameterTuningJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateHyperParameterTuningJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateHyperParameterTuningJobRequest create-hyper-parameter-tuning-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHyperParameterTuningJobAsync create-hyper-parameter-tuning-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateHyperParameterTuningJobRequest create-hyper-parameter-tuning-job-request]
    (-> this (.createHyperParameterTuningJobAsync create-hyper-parameter-tuning-job-request))))

(defn create-training-job-async
  "Starts a model training job. After training completes, Amazon SageMaker saves the resulting model artifacts to an
   Amazon S3 location that you specify.


   If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model
   artifacts as part of the model. You can also use the artifacts in a machine learning service other than Amazon
   SageMaker, provided that you know how to use them for inferences.


   In the request body, you provide the following:




   AlgorithmSpecification - Identifies the training algorithm to use.




   HyperParameters - Specify these algorithm-specific parameters to enable the estimation of model
   parameters during training. Hyperparameters can be tuned to optimize this learning process. For a list of
   hyperparameters for each training algorithm provided by Amazon SageMaker, see Algorithms.




   InputDataConfig - Describes the training dataset and the Amazon S3 location where it is stored.




   OutputDataConfig - Identifies the Amazon S3 location where you want Amazon SageMaker to save the
   results of model training.




   ResourceConfig - Identifies the resources, ML compute instances, and ML storage volumes to deploy
   for model training. In distributed training, you specify more than one instance.




   RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to perform tasks on your
   behalf during model training. You must grant this role the necessary permissions so that Amazon SageMaker can
   successfully complete model training.




   StoppingCondition - Sets a time limit for training. Use this parameter to cap model training costs.




   For more information about Amazon SageMaker, see How It Works.

  create-training-job-request - `com.amazonaws.services.sagemaker.model.CreateTrainingJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrainingJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateTrainingJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateTrainingJobRequest create-training-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrainingJobAsync create-training-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateTrainingJobRequest create-training-job-request]
    (-> this (.createTrainingJobAsync create-training-job-request))))

(defn update-notebook-instance-async
  "Updates a notebook instance. NotebookInstance updates include upgrading or downgrading the ML compute instance
   used for your notebook instance to accommodate changes in your workload requirements.

  update-notebook-instance-request - `com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateNotebookInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceRequest update-notebook-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateNotebookInstanceAsync update-notebook-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceRequest update-notebook-instance-request]
    (-> this (.updateNotebookInstanceAsync update-notebook-instance-request))))

(defn update-code-repository-async
  "Updates the specified Git repository with the specified values.

  update-code-repository-request - `com.amazonaws.services.sagemaker.model.UpdateCodeRepositoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCodeRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.UpdateCodeRepositoryResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.UpdateCodeRepositoryRequest update-code-repository-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCodeRepositoryAsync update-code-repository-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.UpdateCodeRepositoryRequest update-code-repository-request]
    (-> this (.updateCodeRepositoryAsync update-code-repository-request))))

(defn list-endpoints-async
  "Lists endpoints.

  list-endpoints-request - `com.amazonaws.services.sagemaker.model.ListEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListEndpointsRequest list-endpoints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEndpointsAsync list-endpoints-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListEndpointsRequest list-endpoints-request]
    (-> this (.listEndpointsAsync list-endpoints-request))))

(defn describe-endpoint-async
  "Returns the description of an endpoint.

  describe-endpoint-request - `com.amazonaws.services.sagemaker.model.DescribeEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeEndpointRequest describe-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointAsync describe-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeEndpointRequest describe-endpoint-request]
    (-> this (.describeEndpointAsync describe-endpoint-request))))

(defn list-workteams-async
  "Gets a list of work teams that you have defined in a region. The list may be empty if no work team satisfies the
   filter specified in the NameContains parameter.

  list-workteams-request - `com.amazonaws.services.sagemaker.model.ListWorkteamsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWorkteams operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListWorkteamsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListWorkteamsRequest list-workteams-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWorkteamsAsync list-workteams-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListWorkteamsRequest list-workteams-request]
    (-> this (.listWorkteamsAsync list-workteams-request))))

(defn stop-compilation-job-async
  "Stops a model compilation job.


   To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This gracefully shuts the job down. If
   the job hasn't stopped, it sends the SIGKILL signal.


   When it receives a StopCompilationJob request, Amazon SageMaker changes the
   CompilationJobSummary$CompilationJobStatus of the job to Stopping. After Amazon SageMaker
   stops the job, it sets the CompilationJobSummary$CompilationJobStatus to Stopped.

  stop-compilation-job-request - `com.amazonaws.services.sagemaker.model.StopCompilationJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopCompilationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.StopCompilationJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.StopCompilationJobRequest stop-compilation-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopCompilationJobAsync stop-compilation-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.StopCompilationJobRequest stop-compilation-job-request]
    (-> this (.stopCompilationJobAsync stop-compilation-job-request))))

(defn create-presigned-notebook-instance-url-async
  "Returns a URL that you can use to connect to the Jupyter server from a notebook instance. In the Amazon SageMaker
   console, when you choose Open next to a notebook instance, Amazon SageMaker opens a new tab showing
   the Jupyter server home page from the notebook instance. The console uses this API to get the URL and show the
   page.


   IAM authorization policies for this API are also enforced for every HTTP request and WebSocket frame that
   attempts to connect to the notebook instance.For example, you can restrict access to this API and to the URL that
   it returns to a list of IP addresses that you specify. Use the NotIpAddress condition operator and
   the aws:SourceIP condition context key to specify the list of IP addresses that you want to have
   access to the notebook instance. For more information, see Limit Access to a Notebook Instance by
   IP Address.



   The URL that you get from a call to is valid only for 5 minutes. If you try to use the URL after the 5-minute
   limit expires, you are directed to the AWS console sign-in page.

  create-presigned-notebook-instance-url-request - `com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePresignedNotebookInstanceUrl operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlRequest create-presigned-notebook-instance-url-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPresignedNotebookInstanceUrlAsync create-presigned-notebook-instance-url-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlRequest create-presigned-notebook-instance-url-request]
    (-> this (.createPresignedNotebookInstanceUrlAsync create-presigned-notebook-instance-url-request))))

(defn delete-algorithm-async
  "Removes the specified algorithm from your account.

  delete-algorithm-request - `com.amazonaws.services.sagemaker.model.DeleteAlgorithmRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAlgorithm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteAlgorithmResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteAlgorithmRequest delete-algorithm-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAlgorithmAsync delete-algorithm-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteAlgorithmRequest delete-algorithm-request]
    (-> this (.deleteAlgorithmAsync delete-algorithm-request))))

(defn describe-code-repository-async
  "Gets details about the specified Git repository.

  describe-code-repository-request - `com.amazonaws.services.sagemaker.model.DescribeCodeRepositoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCodeRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeCodeRepositoryResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeCodeRepositoryRequest describe-code-repository-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCodeRepositoryAsync describe-code-repository-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeCodeRepositoryRequest describe-code-repository-request]
    (-> this (.describeCodeRepositoryAsync describe-code-repository-request))))

(defn start-notebook-instance-async
  "Launches an ML compute instance with the latest version of the libraries and attaches your ML storage volume.
   After configuring the notebook instance, Amazon SageMaker sets the notebook instance status to
   InService. A notebook instance's status must be InService before you can connect to
   your Jupyter notebook.

  start-notebook-instance-request - `com.amazonaws.services.sagemaker.model.StartNotebookInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartNotebookInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.StartNotebookInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.StartNotebookInstanceRequest start-notebook-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startNotebookInstanceAsync start-notebook-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.StartNotebookInstanceRequest start-notebook-instance-request]
    (-> this (.startNotebookInstanceAsync start-notebook-instance-request))))

(defn create-algorithm-async
  "Create a machine learning algorithm that you can use in Amazon SageMaker and list in the AWS Marketplace.

  create-algorithm-request - `com.amazonaws.services.sagemaker.model.CreateAlgorithmRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAlgorithm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateAlgorithmResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateAlgorithmRequest create-algorithm-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAlgorithmAsync create-algorithm-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateAlgorithmRequest create-algorithm-request]
    (-> this (.createAlgorithmAsync create-algorithm-request))))

(defn render-ui-template-async
  "Renders the UI template so that you can preview the worker's experience.

  render-ui-template-request - `com.amazonaws.services.sagemaker.model.RenderUiTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RenderUiTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.RenderUiTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.RenderUiTemplateRequest render-ui-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.renderUiTemplateAsync render-ui-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.RenderUiTemplateRequest render-ui-template-request]
    (-> this (.renderUiTemplateAsync render-ui-template-request))))

(defn create-endpoint-async
  "Creates an endpoint using the endpoint configuration specified in the request. Amazon SageMaker uses the endpoint
   to provision resources and deploy models. You create the endpoint configuration with the CreateEndpointConfig
   API.



   Use this API only for hosting models using Amazon SageMaker hosting services.


   You must not delete an EndpointConfig in use by an endpoint that is live or while the
   UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. To
   update an endpoint, you must create a new EndpointConfig.



   The endpoint name must be unique within an AWS Region in your AWS account.


   When it receives the request, Amazon SageMaker creates the endpoint, launches the resources (ML compute
   instances), and deploys the model(s) on them.


   When Amazon SageMaker receives the request, it sets the endpoint status to Creating. After it
   creates the endpoint, it sets the status to InService. Amazon SageMaker can then process incoming
   requests for inferences. To check the status of an endpoint, use the DescribeEndpoint API.


   For an example, see Exercise 1: Using the
   K-Means Algorithm Provided by Amazon SageMaker.


   If any of the models hosted at this endpoint get model data from an Amazon S3 location, Amazon SageMaker uses AWS
   Security Token Service to download model artifacts from the S3 path you provided. AWS STS is activated in your
   IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS
   for that region. For more information, see Activating and
   Deactivating AWS STS i an AWS Region in the AWS Identity and Access Management User Guide.

  create-endpoint-request - `com.amazonaws.services.sagemaker.model.CreateEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateEndpointRequest create-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEndpointAsync create-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateEndpointRequest create-endpoint-request]
    (-> this (.createEndpointAsync create-endpoint-request))))

(defn list-tags-async
  "Returns the tags for the specified Amazon SageMaker resource.

  list-tags-request - `com.amazonaws.services.sagemaker.model.ListTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListTagsRequest list-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync list-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListTagsRequest list-tags-request]
    (-> this (.listTagsAsync list-tags-request))))

(defn delete-tags-async
  "Deletes the specified tags from an Amazon SageMaker resource.


   To list a resource's tags, use the ListTags API.



   When you call this API to delete tags from a hyperparameter tuning job, the deleted tags are not removed from
   training jobs that the hyperparameter tuning job launched before you called this API.

  delete-tags-request - `com.amazonaws.services.sagemaker.model.DeleteTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteTagsRequest delete-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync delete-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTagsAsync delete-tags-request))))

(defn update-endpoint-weights-and-capacities-async
  "Updates variant weight of one or more variants associated with an existing endpoint, or capacity of one variant
   associated with an existing endpoint. When it receives the request, Amazon SageMaker sets the endpoint status to
   Updating. After updating the endpoint, it sets the status to InService. To check the
   status of an endpoint, use the DescribeEndpoint API.

  update-endpoint-weights-and-capacities-request - `com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEndpointWeightsAndCapacities operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesRequest update-endpoint-weights-and-capacities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEndpointWeightsAndCapacitiesAsync update-endpoint-weights-and-capacities-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesRequest update-endpoint-weights-and-capacities-request]
    (-> this (.updateEndpointWeightsAndCapacitiesAsync update-endpoint-weights-and-capacities-request))))

(defn list-training-jobs-for-hyper-parameter-tuning-job-async
  "Gets a list of TrainingJobSummary objects that describe the training jobs that a hyperparameter tuning job
   launched.

  list-training-jobs-for-hyper-parameter-tuning-job-request - `com.amazonaws.services.sagemaker.model.ListTrainingJobsForHyperParameterTuningJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTrainingJobsForHyperParameterTuningJob operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListTrainingJobsForHyperParameterTuningJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListTrainingJobsForHyperParameterTuningJobRequest list-training-jobs-for-hyper-parameter-tuning-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTrainingJobsForHyperParameterTuningJobAsync list-training-jobs-for-hyper-parameter-tuning-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListTrainingJobsForHyperParameterTuningJobRequest list-training-jobs-for-hyper-parameter-tuning-job-request]
    (-> this (.listTrainingJobsForHyperParameterTuningJobAsync list-training-jobs-for-hyper-parameter-tuning-job-request))))

(defn stop-transform-job-async
  "Stops a transform job.


   When Amazon SageMaker receives a StopTransformJob request, the status of the job changes to
   Stopping. After Amazon SageMaker stops the job, the status is set to Stopped. When you
   stop a transform job before it is completed, Amazon SageMaker doesn't store the job's output in Amazon S3.

  stop-transform-job-request - `com.amazonaws.services.sagemaker.model.StopTransformJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopTransformJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.StopTransformJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.StopTransformJobRequest stop-transform-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopTransformJobAsync stop-transform-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.StopTransformJobRequest stop-transform-job-request]
    (-> this (.stopTransformJobAsync stop-transform-job-request))))

(defn describe-compilation-job-async
  "Returns information about a model compilation job.


   To create a model compilation job, use CreateCompilationJob. To get information about multiple model
   compilation jobs, use ListCompilationJobs.

  describe-compilation-job-request - `com.amazonaws.services.sagemaker.model.DescribeCompilationJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCompilationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeCompilationJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeCompilationJobRequest describe-compilation-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCompilationJobAsync describe-compilation-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeCompilationJobRequest describe-compilation-job-request]
    (-> this (.describeCompilationJobAsync describe-compilation-job-request))))

(defn list-notebook-instance-lifecycle-configs-async
  "Lists notebook instance lifestyle configurations created with the CreateNotebookInstanceLifecycleConfig
   API.

  list-notebook-instance-lifecycle-configs-request - `com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListNotebookInstanceLifecycleConfigs operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsRequest list-notebook-instance-lifecycle-configs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listNotebookInstanceLifecycleConfigsAsync list-notebook-instance-lifecycle-configs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsRequest list-notebook-instance-lifecycle-configs-request]
    (-> this (.listNotebookInstanceLifecycleConfigsAsync list-notebook-instance-lifecycle-configs-request))))

(defn create-workteam-async
  "Creates a new work team for labeling your data. A work team is defined by one or more Amazon Cognito user pools.
   You must first create the user pools before you can create a work team.


   You cannot create more than 25 work teams in an account and region.

  create-workteam-request - `com.amazonaws.services.sagemaker.model.CreateWorkteamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateWorkteam operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateWorkteamResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateWorkteamRequest create-workteam-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createWorkteamAsync create-workteam-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateWorkteamRequest create-workteam-request]
    (-> this (.createWorkteamAsync create-workteam-request))))

(defn create-notebook-instance-async
  "Creates an Amazon SageMaker notebook instance. A notebook instance is a machine learning (ML) compute instance
   running on a Jupyter notebook.


   In a CreateNotebookInstance request, specify the type of ML compute instance that you want to run.
   Amazon SageMaker launches the instance, installs common libraries that you can use to explore datasets for model
   training, and attaches an ML storage volume to the notebook instance.


   Amazon SageMaker also provides a set of example notebooks. Each notebook demonstrates how to use Amazon SageMaker
   with a specific algorithm or with a machine learning framework.


   After receiving the request, Amazon SageMaker does the following:




   Creates a network interface in the Amazon SageMaker VPC.




   (Option) If you specified SubnetId, Amazon SageMaker creates a network interface in your own VPC,
   which is inferred from the subnet ID that you provide in the input. When creating this network interface, Amazon
   SageMaker attaches the security group that you specified in the request to the network interface that it creates
   in your VPC.




   Launches an EC2 instance of the type specified in the request in the Amazon SageMaker VPC. If you specified
   SubnetId of your VPC, Amazon SageMaker specifies both network interfaces when launching this
   instance. This enables inbound traffic from your own VPC to the notebook instance, assuming that the security
   groups allow it.




   After creating the notebook instance, Amazon SageMaker returns its Amazon Resource Name (ARN).


   After Amazon SageMaker creates the notebook instance, you can connect to the Jupyter server and work in Jupyter
   notebooks. For example, you can write code to explore a dataset that you can use for model training, train a
   model, host models by creating Amazon SageMaker endpoints, and validate hosted models.


   For more information, see How It
   Works.

  create-notebook-instance-request - `com.amazonaws.services.sagemaker.model.CreateNotebookInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNotebookInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateNotebookInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateNotebookInstanceRequest create-notebook-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNotebookInstanceAsync create-notebook-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateNotebookInstanceRequest create-notebook-instance-request]
    (-> this (.createNotebookInstanceAsync create-notebook-instance-request))))

(defn get-search-suggestions-async
  "An auto-complete API for the search functionality in the Amazon SageMaker console. It returns suggestions of
   possible matches for the property name to use in Search queries. Provides suggestions for
   HyperParameters, Tags, and Metrics.

  get-search-suggestions-request - `com.amazonaws.services.sagemaker.model.GetSearchSuggestionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSearchSuggestions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.GetSearchSuggestionsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.GetSearchSuggestionsRequest get-search-suggestions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSearchSuggestionsAsync get-search-suggestions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.GetSearchSuggestionsRequest get-search-suggestions-request]
    (-> this (.getSearchSuggestionsAsync get-search-suggestions-request))))

(defn list-algorithms-async
  "Lists the machine learning algorithms that have been created.

  list-algorithms-request - `com.amazonaws.services.sagemaker.model.ListAlgorithmsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAlgorithms operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListAlgorithmsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListAlgorithmsRequest list-algorithms-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAlgorithmsAsync list-algorithms-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListAlgorithmsRequest list-algorithms-request]
    (-> this (.listAlgorithmsAsync list-algorithms-request))))

(defn update-workteam-async
  "Updates an existing work team with new member definitions or description.

  update-workteam-request - `com.amazonaws.services.sagemaker.model.UpdateWorkteamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateWorkteam operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.UpdateWorkteamResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.UpdateWorkteamRequest update-workteam-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateWorkteamAsync update-workteam-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.UpdateWorkteamRequest update-workteam-request]
    (-> this (.updateWorkteamAsync update-workteam-request))))

(defn describe-subscribed-workteam-async
  "Gets information about a work team provided by a vendor. It returns details about the subscription with a vendor
   in the AWS Marketplace.

  describe-subscribed-workteam-request - `com.amazonaws.services.sagemaker.model.DescribeSubscribedWorkteamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSubscribedWorkteam operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeSubscribedWorkteamResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeSubscribedWorkteamRequest describe-subscribed-workteam-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSubscribedWorkteamAsync describe-subscribed-workteam-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeSubscribedWorkteamRequest describe-subscribed-workteam-request]
    (-> this (.describeSubscribedWorkteamAsync describe-subscribed-workteam-request))))

(defn create-transform-job-async
  "Starts a transform job. A transform job uses a trained model to get inferences on a dataset and saves these
   results to an Amazon S3 location that you specify.


   To perform batch transformations, you create a transform job and use the data that you have readily available.


   In the request body, you provide the following:




   TransformJobName - Identifies the transform job. The name must be unique within an AWS Region in an
   AWS account.




   ModelName - Identifies the model to use. ModelName must be the name of an existing
   Amazon SageMaker model in the same AWS Region and AWS account. For information on creating a model, see
   CreateModel.




   TransformInput - Describes the dataset to be transformed and the Amazon S3 location where it is
   stored.




   TransformOutput - Identifies the Amazon S3 location where you want Amazon SageMaker to save the
   results from the transform job.




   TransformResources - Identifies the ML compute instances for the transform job.




   For more information about how batch transformation works Amazon SageMaker, see How It Works.

  create-transform-job-request - `com.amazonaws.services.sagemaker.model.CreateTransformJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTransformJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateTransformJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateTransformJobRequest create-transform-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTransformJobAsync create-transform-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateTransformJobRequest create-transform-job-request]
    (-> this (.createTransformJobAsync create-transform-job-request))))

(defn delete-endpoint-async
  "Deletes an endpoint. Amazon SageMaker frees up all of the resources that were deployed when the endpoint was
   created.


   Amazon SageMaker retires any custom KMS key grants associated with the endpoint, meaning you don't need to use
   the RevokeGrant API call.

  delete-endpoint-request - `com.amazonaws.services.sagemaker.model.DeleteEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteEndpointRequest delete-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEndpointAsync delete-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteEndpointRequest delete-endpoint-request]
    (-> this (.deleteEndpointAsync delete-endpoint-request))))

(defn describe-endpoint-config-async
  "Returns the description of an endpoint configuration created using the CreateEndpointConfig API.

  describe-endpoint-config-request - `com.amazonaws.services.sagemaker.model.DescribeEndpointConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpointConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeEndpointConfigResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeEndpointConfigRequest describe-endpoint-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointConfigAsync describe-endpoint-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeEndpointConfigRequest describe-endpoint-config-request]
    (-> this (.describeEndpointConfigAsync describe-endpoint-config-request))))

(defn describe-training-job-async
  "Returns information about a training job.

  describe-training-job-request - `com.amazonaws.services.sagemaker.model.DescribeTrainingJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrainingJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeTrainingJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeTrainingJobRequest describe-training-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrainingJobAsync describe-training-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeTrainingJobRequest describe-training-job-request]
    (-> this (.describeTrainingJobAsync describe-training-job-request))))

(defn stop-labeling-job-async
  "Stops a running labeling job. A job that is stopped cannot be restarted. Any results obtained before the job is
   stopped are placed in the Amazon S3 output bucket.

  stop-labeling-job-request - `com.amazonaws.services.sagemaker.model.StopLabelingJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopLabelingJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.StopLabelingJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.StopLabelingJobRequest stop-labeling-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopLabelingJobAsync stop-labeling-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.StopLabelingJobRequest stop-labeling-job-request]
    (-> this (.stopLabelingJobAsync stop-labeling-job-request))))

(defn list-endpoint-configs-async
  "Lists endpoint configurations.

  list-endpoint-configs-request - `com.amazonaws.services.sagemaker.model.ListEndpointConfigsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEndpointConfigs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListEndpointConfigsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListEndpointConfigsRequest list-endpoint-configs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEndpointConfigsAsync list-endpoint-configs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListEndpointConfigsRequest list-endpoint-configs-request]
    (-> this (.listEndpointConfigsAsync list-endpoint-configs-request))))

(defn delete-notebook-instance-lifecycle-config-async
  "Deletes a notebook instance lifecycle configuration.

  delete-notebook-instance-lifecycle-config-request - `com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNotebookInstanceLifecycleConfig operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigRequest delete-notebook-instance-lifecycle-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNotebookInstanceLifecycleConfigAsync delete-notebook-instance-lifecycle-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigRequest delete-notebook-instance-lifecycle-config-request]
    (-> this (.deleteNotebookInstanceLifecycleConfigAsync delete-notebook-instance-lifecycle-config-request))))

(defn describe-labeling-job-async
  "Gets information about a labeling job.

  describe-labeling-job-request - `com.amazonaws.services.sagemaker.model.DescribeLabelingJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLabelingJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeLabelingJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeLabelingJobRequest describe-labeling-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLabelingJobAsync describe-labeling-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeLabelingJobRequest describe-labeling-job-request]
    (-> this (.describeLabelingJobAsync describe-labeling-job-request))))

(defn describe-notebook-instance-async
  "Returns information about a notebook instance.

  describe-notebook-instance-request - `com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNotebookInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceRequest describe-notebook-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNotebookInstanceAsync describe-notebook-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceRequest describe-notebook-instance-request]
    (-> this (.describeNotebookInstanceAsync describe-notebook-instance-request))))

(defn describe-algorithm-async
  "Returns a description of the specified algorithm that is in your account.

  describe-algorithm-request - `com.amazonaws.services.sagemaker.model.DescribeAlgorithmRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAlgorithm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeAlgorithmResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeAlgorithmRequest describe-algorithm-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAlgorithmAsync describe-algorithm-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeAlgorithmRequest describe-algorithm-request]
    (-> this (.describeAlgorithmAsync describe-algorithm-request))))

(defn delete-model-package-async
  "Deletes a model package.


   A model package is used to create Amazon SageMaker models or list on AWS Marketplace. Buyers can subscribe to
   model packages listed on AWS Marketplace to create models in Amazon SageMaker.

  delete-model-package-request - `com.amazonaws.services.sagemaker.model.DeleteModelPackageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteModelPackage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteModelPackageResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteModelPackageRequest delete-model-package-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteModelPackageAsync delete-model-package-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteModelPackageRequest delete-model-package-request]
    (-> this (.deleteModelPackageAsync delete-model-package-request))))

(defn delete-workteam-async
  "Deletes an existing work team. This operation can't be undone.

  delete-workteam-request - `com.amazonaws.services.sagemaker.model.DeleteWorkteamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWorkteam operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteWorkteamResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteWorkteamRequest delete-workteam-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWorkteamAsync delete-workteam-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteWorkteamRequest delete-workteam-request]
    (-> this (.deleteWorkteamAsync delete-workteam-request))))

(defn create-compilation-job-async
  "Starts a model compilation job. After the model has been compiled, Amazon SageMaker saves the resulting model
   artifacts to an Amazon Simple Storage Service (Amazon S3) bucket that you specify.


   If you choose to host your model using Amazon SageMaker hosting services, you can use the resulting model
   artifacts as part of the model. You can also use the artifacts with AWS IoT Greengrass. In that case, deploy them
   as an ML resource.


   In the request body, you provide the following:




   A name for the compilation job




   Information about the input model artifacts




   The output location for the compiled model and the device (target) that the model runs on




   The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes to perform the model compilation job




   You can also provide a Tag to track the model compilation job's resource use and costs. The response
   body contains the CompilationJobArn for the compiled job.


   To stop a model compilation job, use StopCompilationJob. To get information about a particular model
   compilation job, use DescribeCompilationJob. To get information about multiple model compilation jobs, use
   ListCompilationJobs.

  create-compilation-job-request - `com.amazonaws.services.sagemaker.model.CreateCompilationJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCompilationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateCompilationJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateCompilationJobRequest create-compilation-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCompilationJobAsync create-compilation-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateCompilationJobRequest create-compilation-job-request]
    (-> this (.createCompilationJobAsync create-compilation-job-request))))

(defn list-training-jobs-async
  "Lists training jobs.

  list-training-jobs-request - `com.amazonaws.services.sagemaker.model.ListTrainingJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTrainingJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListTrainingJobsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListTrainingJobsRequest list-training-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTrainingJobsAsync list-training-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListTrainingJobsRequest list-training-jobs-request]
    (-> this (.listTrainingJobsAsync list-training-jobs-request))))

(defn describe-model-async
  "Describes a model that you created using the CreateModel API.

  describe-model-request - `com.amazonaws.services.sagemaker.model.DescribeModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeModelResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeModelRequest describe-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeModelAsync describe-model-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeModelRequest describe-model-request]
    (-> this (.describeModelAsync describe-model-request))))

(defn update-notebook-instance-lifecycle-config-async
  "Updates a notebook instance lifecycle configuration created with the CreateNotebookInstanceLifecycleConfig
   API.

  update-notebook-instance-lifecycle-config-request - `com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateNotebookInstanceLifecycleConfig operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigRequest update-notebook-instance-lifecycle-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateNotebookInstanceLifecycleConfigAsync update-notebook-instance-lifecycle-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigRequest update-notebook-instance-lifecycle-config-request]
    (-> this (.updateNotebookInstanceLifecycleConfigAsync update-notebook-instance-lifecycle-config-request))))

(defn delete-model-async
  "Deletes a model. The DeleteModel API deletes only the model entry that was created in Amazon
   SageMaker when you called the CreateModel API. It does not
   delete model artifacts, inference code, or the IAM role that you specified when creating the model.

  delete-model-request - `com.amazonaws.services.sagemaker.model.DeleteModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteModelResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteModelRequest delete-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteModelAsync delete-model-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteModelRequest delete-model-request]
    (-> this (.deleteModelAsync delete-model-request))))

(defn describe-transform-job-async
  "Returns information about a transform job.

  describe-transform-job-request - `com.amazonaws.services.sagemaker.model.DescribeTransformJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTransformJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeTransformJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeTransformJobRequest describe-transform-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTransformJobAsync describe-transform-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeTransformJobRequest describe-transform-job-request]
    (-> this (.describeTransformJobAsync describe-transform-job-request))))

(defn create-notebook-instance-lifecycle-config-async
  "Creates a lifecycle configuration that you can associate with a notebook instance. A lifecycle
   configuration is a collection of shell scripts that run when you create or start a notebook instance.


   Each lifecycle configuration script has a limit of 16384 characters.


   The value of the $PATH environment variable that is available to both scripts is
   /sbin:bin:/usr/sbin:/usr/bin.


   View CloudWatch Logs for notebook instance lifecycle configurations in log group
   /aws/sagemaker/NotebookInstances in log stream
   [notebook-instance-name]/[LifecycleConfigHook].


   Lifecycle configuration scripts cannot run for longer than 5 minutes. If a script runs for longer than 5 minutes,
   it fails and the notebook instance is not created or started.


   For information about notebook instance lifestyle configurations, see Step 2.1: (Optional)
   Customize a Notebook Instance.

  create-notebook-instance-lifecycle-config-request - `com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNotebookInstanceLifecycleConfig operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigRequest create-notebook-instance-lifecycle-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNotebookInstanceLifecycleConfigAsync create-notebook-instance-lifecycle-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigRequest create-notebook-instance-lifecycle-config-request]
    (-> this (.createNotebookInstanceLifecycleConfigAsync create-notebook-instance-lifecycle-config-request))))

(defn describe-hyper-parameter-tuning-job-async
  "Gets a description of a hyperparameter tuning job.

  describe-hyper-parameter-tuning-job-request - `com.amazonaws.services.sagemaker.model.DescribeHyperParameterTuningJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHyperParameterTuningJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeHyperParameterTuningJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeHyperParameterTuningJobRequest describe-hyper-parameter-tuning-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHyperParameterTuningJobAsync describe-hyper-parameter-tuning-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeHyperParameterTuningJobRequest describe-hyper-parameter-tuning-job-request]
    (-> this (.describeHyperParameterTuningJobAsync describe-hyper-parameter-tuning-job-request))))

(defn search-async
  "Finds Amazon SageMaker resources that match a search query. Matching resource objects are returned as a list of
   SearchResult objects in the response. You can sort the search results by any resource property in a
   ascending or descending order.


   You can query against the following value types: numerical, text, Booleans, and timestamps.

  search-request - `com.amazonaws.services.sagemaker.model.SearchRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Search operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.SearchResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.SearchRequest search-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchAsync search-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.SearchRequest search-request]
    (-> this (.searchAsync search-request))))

(defn list-models-async
  "Lists models created with the CreateModel API.

  list-models-request - `com.amazonaws.services.sagemaker.model.ListModelsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListModels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListModelsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListModelsRequest list-models-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listModelsAsync list-models-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListModelsRequest list-models-request]
    (-> this (.listModelsAsync list-models-request))))

(defn create-model-async
  "Creates a model in Amazon SageMaker. In the request, you name the model and describe a primary container. For the
   primary container, you specify the docker image containing inference code, artifacts (from prior training), and
   custom environment map that the inference code uses when you deploy the model for predictions.


   Use this API to create a model if you want to use Amazon SageMaker hosting services or run a batch transform job.


   To host your model, you create an endpoint configuration with the CreateEndpointConfig API, and then
   create an endpoint with the CreateEndpoint API. Amazon SageMaker then deploys all of the containers
   that you defined for the model in the hosting environment.


   To run a batch transform using your model, you start a job with the CreateTransformJob API. Amazon
   SageMaker uses your model and your dataset to get inferences which are then saved to a specified S3 location.


   In the CreateModel request, you must define a container with the PrimaryContainer
   parameter.


   In the request, you also provide an IAM role that Amazon SageMaker can assume to access model artifacts and
   docker image for deployment on ML compute hosting instances or for batch transform jobs. In addition, you also
   use the IAM role to manage permissions the inference code needs. For example, if the inference code access any
   other AWS resources, you grant necessary permissions via this role.

  create-model-request - `com.amazonaws.services.sagemaker.model.CreateModelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateModelResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateModelRequest create-model-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createModelAsync create-model-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateModelRequest create-model-request]
    (-> this (.createModelAsync create-model-request))))

(defn delete-endpoint-config-async
  "Deletes an endpoint configuration. The DeleteEndpointConfig API deletes only the specified
   configuration. It does not delete endpoints created using the configuration.

  delete-endpoint-config-request - `com.amazonaws.services.sagemaker.model.DeleteEndpointConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEndpointConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteEndpointConfigResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteEndpointConfigRequest delete-endpoint-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEndpointConfigAsync delete-endpoint-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteEndpointConfigRequest delete-endpoint-config-request]
    (-> this (.deleteEndpointConfigAsync delete-endpoint-config-request))))

(defn list-hyper-parameter-tuning-jobs-async
  "Gets a list of HyperParameterTuningJobSummary objects that describe the hyperparameter tuning jobs
   launched in your account.

  list-hyper-parameter-tuning-jobs-request - `com.amazonaws.services.sagemaker.model.ListHyperParameterTuningJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHyperParameterTuningJobs operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListHyperParameterTuningJobsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListHyperParameterTuningJobsRequest list-hyper-parameter-tuning-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHyperParameterTuningJobsAsync list-hyper-parameter-tuning-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListHyperParameterTuningJobsRequest list-hyper-parameter-tuning-jobs-request]
    (-> this (.listHyperParameterTuningJobsAsync list-hyper-parameter-tuning-jobs-request))))

(defn create-code-repository-async
  "Creates a Git repository as a resource in your Amazon SageMaker account. You can associate the repository with
   notebook instances so that you can use Git source control for the notebooks you create. The Git repository is a
   resource in your Amazon SageMaker account, so it can be associated with more than one notebook instance, and it
   persists independently from the lifecycle of any notebook instances it is associated with.


   The repository can be hosted either in AWS CodeCommit or in any other Git
   repository.

  create-code-repository-request - `com.amazonaws.services.sagemaker.model.CreateCodeRepositoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCodeRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateCodeRepositoryResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateCodeRepositoryRequest create-code-repository-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCodeRepositoryAsync create-code-repository-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateCodeRepositoryRequest create-code-repository-request]
    (-> this (.createCodeRepositoryAsync create-code-repository-request))))

(defn list-labeling-jobs-async
  "Gets a list of labeling jobs.

  list-labeling-jobs-request - `com.amazonaws.services.sagemaker.model.ListLabelingJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLabelingJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListLabelingJobsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListLabelingJobsRequest list-labeling-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLabelingJobsAsync list-labeling-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListLabelingJobsRequest list-labeling-jobs-request]
    (-> this (.listLabelingJobsAsync list-labeling-jobs-request))))

(defn list-labeling-jobs-for-workteam-async
  "Gets a list of labeling jobs assigned to a specified work team.

  list-labeling-jobs-for-workteam-request - `com.amazonaws.services.sagemaker.model.ListLabelingJobsForWorkteamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLabelingJobsForWorkteam operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListLabelingJobsForWorkteamResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListLabelingJobsForWorkteamRequest list-labeling-jobs-for-workteam-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLabelingJobsForWorkteamAsync list-labeling-jobs-for-workteam-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListLabelingJobsForWorkteamRequest list-labeling-jobs-for-workteam-request]
    (-> this (.listLabelingJobsForWorkteamAsync list-labeling-jobs-for-workteam-request))))

(defn stop-hyper-parameter-tuning-job-async
  "Stops a running hyperparameter tuning job and all running training jobs that the tuning job launched.


   All model artifacts output from the training jobs are stored in Amazon Simple Storage Service (Amazon S3). All
   data that the training jobs write to Amazon CloudWatch Logs are still available in CloudWatch. After the tuning
   job moves to the Stopped state, it releases all reserved resources for the tuning job.

  stop-hyper-parameter-tuning-job-request - `com.amazonaws.services.sagemaker.model.StopHyperParameterTuningJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopHyperParameterTuningJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.StopHyperParameterTuningJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.StopHyperParameterTuningJobRequest stop-hyper-parameter-tuning-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopHyperParameterTuningJobAsync stop-hyper-parameter-tuning-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.StopHyperParameterTuningJobRequest stop-hyper-parameter-tuning-job-request]
    (-> this (.stopHyperParameterTuningJobAsync stop-hyper-parameter-tuning-job-request))))

(defn delete-code-repository-async
  "Deletes the specified Git repository from your account.

  delete-code-repository-request - `com.amazonaws.services.sagemaker.model.DeleteCodeRepositoryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCodeRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteCodeRepositoryResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteCodeRepositoryRequest delete-code-repository-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCodeRepositoryAsync delete-code-repository-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteCodeRepositoryRequest delete-code-repository-request]
    (-> this (.deleteCodeRepositoryAsync delete-code-repository-request))))

(defn describe-notebook-instance-lifecycle-config-async
  "Returns a description of a notebook instance lifecycle configuration.


   For information about notebook instance lifestyle configurations, see Step 2.1: (Optional)
   Customize a Notebook Instance.

  describe-notebook-instance-lifecycle-config-request - `com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNotebookInstanceLifecycleConfig operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigRequest describe-notebook-instance-lifecycle-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNotebookInstanceLifecycleConfigAsync describe-notebook-instance-lifecycle-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigRequest describe-notebook-instance-lifecycle-config-request]
    (-> this (.describeNotebookInstanceLifecycleConfigAsync describe-notebook-instance-lifecycle-config-request))))

(defn create-endpoint-config-async
  "Creates an endpoint configuration that Amazon SageMaker hosting services uses to deploy models. In the
   configuration, you identify one or more models, created using the CreateModel API, to deploy and the
   resources that you want Amazon SageMaker to provision. Then you call the CreateEndpoint API.



   Use this API only if you want to use Amazon SageMaker hosting services to deploy models into production.



   In the request, you define one or more ProductionVariants, each of which identifies a model. Each
   ProductionVariant parameter also describes the resources that you want Amazon SageMaker to
   provision. This includes the number and type of ML compute instances to deploy.


   If you are hosting multiple models, you also assign a VariantWeight to specify how much traffic you
   want to allocate to each model. For example, suppose that you want to host two models, A and B, and you assign
   traffic weight 2 for model A and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to Model
   A, and one-third to model B.

  create-endpoint-config-request - `com.amazonaws.services.sagemaker.model.CreateEndpointConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEndpointConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateEndpointConfigResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateEndpointConfigRequest create-endpoint-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEndpointConfigAsync create-endpoint-config-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateEndpointConfigRequest create-endpoint-config-request]
    (-> this (.createEndpointConfigAsync create-endpoint-config-request))))

(defn describe-model-package-async
  "Returns a description of the specified model package, which is used to create Amazon SageMaker models or list
   them on AWS Marketplace.


   To create models in Amazon SageMaker, buyers can subscribe to model packages listed on AWS Marketplace.

  describe-model-package-request - `com.amazonaws.services.sagemaker.model.DescribeModelPackageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeModelPackage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeModelPackageResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeModelPackageRequest describe-model-package-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeModelPackageAsync describe-model-package-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeModelPackageRequest describe-model-package-request]
    (-> this (.describeModelPackageAsync describe-model-package-request))))

(defn stop-training-job-async
  "Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which
   delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts,
   so the results of the training is not lost.


   When it receives a StopTrainingJob request, Amazon SageMaker changes the status of the job to
   Stopping. After Amazon SageMaker stops the job, it sets the status to Stopped.

  stop-training-job-request - `com.amazonaws.services.sagemaker.model.StopTrainingJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopTrainingJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.StopTrainingJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.StopTrainingJobRequest stop-training-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopTrainingJobAsync stop-training-job-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.StopTrainingJobRequest stop-training-job-request]
    (-> this (.stopTrainingJobAsync stop-training-job-request))))

(defn list-compilation-jobs-async
  "Lists model compilation jobs that satisfy various filters.


   To create a model compilation job, use CreateCompilationJob. To get information about a particular model
   compilation job you have created, use DescribeCompilationJob.

  list-compilation-jobs-request - `com.amazonaws.services.sagemaker.model.ListCompilationJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCompilationJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListCompilationJobsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListCompilationJobsRequest list-compilation-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCompilationJobsAsync list-compilation-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListCompilationJobsRequest list-compilation-jobs-request]
    (-> this (.listCompilationJobsAsync list-compilation-jobs-request))))

(defn list-subscribed-workteams-async
  "Gets a list of the work teams that you are subscribed to in the AWS Marketplace. The list may be empty if no work
   team satisfies the filter specified in the NameContains parameter.

  list-subscribed-workteams-request - `com.amazonaws.services.sagemaker.model.ListSubscribedWorkteamsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSubscribedWorkteams operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListSubscribedWorkteamsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListSubscribedWorkteamsRequest list-subscribed-workteams-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSubscribedWorkteamsAsync list-subscribed-workteams-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListSubscribedWorkteamsRequest list-subscribed-workteams-request]
    (-> this (.listSubscribedWorkteamsAsync list-subscribed-workteams-request))))

(defn list-transform-jobs-async
  "Lists transform jobs.

  list-transform-jobs-request - `com.amazonaws.services.sagemaker.model.ListTransformJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTransformJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListTransformJobsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListTransformJobsRequest list-transform-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTransformJobsAsync list-transform-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListTransformJobsRequest list-transform-jobs-request]
    (-> this (.listTransformJobsAsync list-transform-jobs-request))))

(defn stop-notebook-instance-async
  "Terminates the ML compute instance. Before terminating the instance, Amazon SageMaker disconnects the ML storage
   volume from it. Amazon SageMaker preserves the ML storage volume. Amazon SageMaker stops charging you for the ML
   compute instance when you call StopNotebookInstance.


   To access data on the ML storage volume for a notebook instance that has been terminated, call the
   StartNotebookInstance API. StartNotebookInstance launches another ML compute instance,
   configures it, and attaches the preserved ML storage volume so you can continue your work.

  stop-notebook-instance-request - `com.amazonaws.services.sagemaker.model.StopNotebookInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopNotebookInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.StopNotebookInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.StopNotebookInstanceRequest stop-notebook-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopNotebookInstanceAsync stop-notebook-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.StopNotebookInstanceRequest stop-notebook-instance-request]
    (-> this (.stopNotebookInstanceAsync stop-notebook-instance-request))))

(defn list-code-repositories-async
  "Gets a list of the Git repositories in your account.

  list-code-repositories-request - `com.amazonaws.services.sagemaker.model.ListCodeRepositoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCodeRepositories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListCodeRepositoriesResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListCodeRepositoriesRequest list-code-repositories-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCodeRepositoriesAsync list-code-repositories-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListCodeRepositoriesRequest list-code-repositories-request]
    (-> this (.listCodeRepositoriesAsync list-code-repositories-request))))

(defn create-model-package-async
  "Creates a model package that you can use to create Amazon SageMaker models or list on AWS Marketplace. Buyers can
   subscribe to model packages listed on AWS Marketplace to create models in Amazon SageMaker.


   To create a model package by specifying a Docker container that contains your inference code and the Amazon S3
   location of your model artifacts, provide values for InferenceSpecification. To create a model from
   an algorithm resource that you created or subscribed to in AWS Marketplace, provide a value for
   SourceAlgorithmSpecification.

  create-model-package-request - `com.amazonaws.services.sagemaker.model.CreateModelPackageRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateModelPackage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateModelPackageResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateModelPackageRequest create-model-package-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createModelPackageAsync create-model-package-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.CreateModelPackageRequest create-model-package-request]
    (-> this (.createModelPackageAsync create-model-package-request))))

(defn delete-notebook-instance-async
  "Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook instance, you must call the
   StopNotebookInstance API.



   When you delete a notebook instance, you lose all of your data. Amazon SageMaker removes the ML compute instance,
   and deletes the ML storage volume and the network interface associated with the notebook instance.

  delete-notebook-instance-request - `com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNotebookInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceRequest delete-notebook-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNotebookInstanceAsync delete-notebook-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceRequest delete-notebook-instance-request]
    (-> this (.deleteNotebookInstanceAsync delete-notebook-instance-request))))

(defn list-model-packages-async
  "Lists the model packages that have been created.

  list-model-packages-request - `com.amazonaws.services.sagemaker.model.ListModelPackagesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListModelPackages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListModelPackagesResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListModelPackagesRequest list-model-packages-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listModelPackagesAsync list-model-packages-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListModelPackagesRequest list-model-packages-request]
    (-> this (.listModelPackagesAsync list-model-packages-request))))

(defn add-tags-async
  "Adds or overwrites one or more tags for the specified Amazon SageMaker resource. You can add tags to notebook
   instances, training jobs, hyperparameter tuning jobs, batch transform jobs, models, labeling jobs, work teams,
   endpoint configurations, and endpoints.


   Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information
   about tags, see For more information, see AWS Tagging Strategies.



   Tags that you add to a hyperparameter tuning job by calling this API are also added to any training jobs that the
   hyperparameter tuning job launches after you call this API, but not to training jobs that the hyperparameter
   tuning job launched before you called this API. To make sure that the tags associated with a hyperparameter
   tuning job are also added to all training jobs that the hyperparameter tuning job launches, add the tags when you
   first create the tuning job by specifying them in the Tags parameter of
   CreateHyperParameterTuningJob

  add-tags-request - `com.amazonaws.services.sagemaker.model.AddTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.AddTagsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.AddTagsRequest add-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsAsync add-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.AddTagsRequest add-tags-request]
    (-> this (.addTagsAsync add-tags-request))))

(defn list-notebook-instances-async
  "Returns a list of the Amazon SageMaker notebook instances in the requester's account in an AWS Region.

  list-notebook-instances-request - `com.amazonaws.services.sagemaker.model.ListNotebookInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListNotebookInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListNotebookInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListNotebookInstancesRequest list-notebook-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listNotebookInstancesAsync list-notebook-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.ListNotebookInstancesRequest list-notebook-instances-request]
    (-> this (.listNotebookInstancesAsync list-notebook-instances-request))))

(defn describe-workteam-async
  "Gets information about a specific work team. You can see information such as the create date, the last updated
   date, membership information, and the work team's Amazon Resource Name (ARN).

  describe-workteam-request - `com.amazonaws.services.sagemaker.model.DescribeWorkteamRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWorkteam operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeWorkteamResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeWorkteamRequest describe-workteam-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWorkteamAsync describe-workteam-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.DescribeWorkteamRequest describe-workteam-request]
    (-> this (.describeWorkteamAsync describe-workteam-request))))

(defn update-endpoint-async
  "Deploys the new EndpointConfig specified in the request, switches to using newly created endpoint,
   and then deletes resources provisioned for the endpoint using the previous EndpointConfig (there is
   no availability loss).


   When Amazon SageMaker receives the request, it sets the endpoint status to Updating. After updating
   the endpoint, it sets the status to InService. To check the status of an endpoint, use the DescribeEndpoint API.



   You must not delete an EndpointConfig in use by an endpoint that is live or while the
   UpdateEndpoint or CreateEndpoint operations are being performed on the endpoint. To
   update an endpoint, you must create a new EndpointConfig.

  update-endpoint-request - `com.amazonaws.services.sagemaker.model.UpdateEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.UpdateEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.UpdateEndpointRequest update-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEndpointAsync update-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsync this ^com.amazonaws.services.sagemaker.model.UpdateEndpointRequest update-endpoint-request]
    (-> this (.updateEndpointAsync update-endpoint-request))))

