(ns vermillion.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[vermillion started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[vermillion has shut down successfully]=-"))
   :middleware identity})
