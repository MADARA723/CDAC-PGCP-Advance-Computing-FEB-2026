import React, { useState, useEffect } from "react";

function ClockBg() {
    const [time, setTime] = useState(new Date());

    useEffect(() => {
        const interval = setInterval(() => {
            setTime(new Date());
        }, 1000);

        return () => clearInterval(interval);
    }, []);

    // Get AM / PM
    const hours = time.getHours();
    const isAM = hours < 12;

    // Background color logic
    const bgColor = isAM ? "#87CEFA" : "#2c3e50"; // light blue / dark

    const textColor = isAM ? "#000" : "#fff";

    return (
        <div
            style={{
                backgroundColor: bgColor,
                color: textColor,
                height: "200px",
                width: "200px",
                display: "flex",
                justifyContent: "center",
                alignItems: "center",
                flexDirection: "column",
                marginTop: "50px"
            }}
        >
            <h1>{time.toLocaleTimeString()}</h1>
            <h2>{isAM ? "Good Morning 🌅" : "Good Evening 🌙"}</h2>
        </div>
    );
}

export default ClockBg;